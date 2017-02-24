package com.metrics.service.message.opc;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formosoft.ra.taica2.RAFacade2;
import com.metrics.config.RAConfig;
import com.metrics.config.TCBConfig;
import com.metrics.exception.OPCException;
import com.metrics.mq.ibm.OPCMessageReceiver;
import com.metrics.mq.ibm.OPCMessageSender;
import com.metrics.service.message.OXMService;
import com.metrics.utils.OpcUtil;
import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.CHGKEYREQ;
import com.metrics.xml.message.opc.def.CHGKEYRSP;
import com.metrics.xml.message.opc.xml.CHGKEYCFRMMessage;
import com.metrics.xml.message.opc.xml.CHGKEYMessage;
import com.metrics.xml.message.opc.xml.CHGKEYREQMessage;
import com.metrics.xml.message.opc.xml.CHGKEYRSPMessage;


/**
 * @author Ethan Lee
 */
 @Service
public class OpcKeyChangeService
{
	protected static final Logger logger = LoggerFactory.getLogger( OpcKeyChangeService.class );
	private static final String FORMAT_OPC_TIMESTAMP = "yyyyMMddHHmmss";

	@Autowired
	private RAConfig raConfig = null;
	@Autowired
	private OXMService oxmService = null;
	@Autowired
	private TCBConfig tcbConfig = null;
	@Autowired
	private OPCMessageSender opcMessageSender = null;
	@Autowired
	private OPCMessageReceiver opcMessageReceiver = null;
	@Autowired
	private RAFacade2 raFacade = null;

	private String auditNo = null;
	private String randomPlusOne = null;
	private String randomPlusTwo = null;

	public boolean start() {
		boolean result = false;
		// set current audit no
		auditNo = OpcUtil.newAuditNo();

		try {
			sendChangeKeyRequest();
			sendChangeKey();
			sendChangeKeyResponse();
			sendChangeKeyConfirm();

			result = true;
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}

	/**
	 * 步驟1: 要求變更基碼通知交易請求
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0101" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085000" RSP_CODE="0001" ><CHG_KEY_REQ/></OPCMESSAGE>
	 * reseponse :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0102" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001"><CHG_KEY KEY_ID="02" NEW_KEY=
	 * "7B111F157B396BAF80EC30A0071A47B6" RANDOM_NO="B6E9BC3BA229C61D"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyRequest() throws Throwable {
		try {
			CHGKEYREQMessage message = new CHGKEYREQMessage();

			message.setMSGTYPE( CHGKEYREQMessage.MESSAGE_TYPE );
			message.setPRCCODE( CHGKEYREQMessage.PRC_CODE );
			message.setAUDITNO( auditNo );
			message.setORIGIN( tcbConfig.getParticipantId() );
			message.setRSPCODE( OPCMESSAGE.RESPONSE_SUCCESS );
			message.setBody( new CHGKEYREQ() );

			String result = oxmService.marshallOPCMessage( setOPCMessageInfo( message ) );

			logger.info( "step 1. CHGKEYREQMessage => send change key request to OPC : {}", result );

			opcMessageSender.send( result );

			logger.info( "step 1. CHGKEYREQMessage => msgtype : {}, prccode : {}, origin : {}, ts : {}, auditno : {}, rspcode : {}, result : {}  ",
			        new Object[] { message.getMSGTYPE(), message.getPRCCODE(), message.getORIGIN(), message.getTS(), message.getAUDITNO(), message.getRSPCODE(),
			                result } );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );

			throw new OPCException( "OPC換KEY時失敗！" + cause.toString() );
		}
	}

	/**
	 * 步驟2: 要求變更基碼通知交易回應 1.等待集保傳回回應訊息 2.確認訊息後登入RA 3.將取得的KEY匯入RA send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0102" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001"><CHG_KEY KEY_ID="02" NEW_KEY=
	 * "7B111F157B396BAF80EC30A0071A47B6" RANDOM_NO="B6E9BC3BA229C61D"/></OPCMESSAGE>
	 */
	protected void sendChangeKey() throws Throwable {
		CHGKEYMessage message = null;

		try {
			String result = opcMessageReceiver.receive();

			logger.info( "step 2. CHGKEYMessage => receive change key from OPC : {}", result );
			message = oxmService.unMarshallOPCMessage( new CHGKEYMessage(), result );

			if (!OPCMESSAGE.RESPONSE_SUCCESS.equalsIgnoreCase( message.getRSPCODE() )) {
				// todo throw a exception
				logger.error( "step 2. CHGKEYMessage => OPC change key response code : {}", message.getRSPCODE() );
				throw new OPCException( "CHGKEYMessage => CHGKEYMessage : " + message.getPRCCODE() );
			}

			logger.info( "step 2. CHGKEYMessage => Login RA : {}", OpcUtil.loginRA( raFacade, raConfig.getLoginId(), raConfig.getPassword() ) );

			int importResult = raFacade.FSSS_ImportKeyAndRandom( raFacade.FSRA2_GetKey1(), raConfig.getCdKey(), raConfig.getNewWorkingKey(),
			        OpcUtil.pack( message.getBody().getNEWKEY(), 32 ), new byte[8], OpcUtil.pack( message.getBody().getRANDOMNO(), 16 ), 544 );

			if (0 != importResult) {
				logger.warn( "step 2. CHGKEYMessage => import key and random : {}, message : {}", importResult, raFacade.FSRA2_GetErrorMsg() );
				throw new OPCException( "CHGKEYMessage => import key and random : " + importResult + ", message : " + raFacade.FSRA2_GetErrorMsg() );
			} else {
				randomPlusOne = raFacade.FSSS_GetEncryptedRandomPlusOne(); // RN + 1
				randomPlusTwo = raFacade.FSSS_GetEncryptedRandomPlusTwo(); // RN + 2
			}

			logger.info( "step 2. CHGKEYMessage => msgtype : {}, prccode : {}, origin : {}, ts : {}, auditno : {}, rspcode : {}, result : {}  ", new Object[] {
			        message.getMSGTYPE(), message.getPRCCODE(), message.getORIGIN(), message.getTS(), message.getAUDITNO(), message.getRSPCODE(), result } );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );

			throw new OPCException( "OPC換KEY時失敗！" + cause.toString() );
		}
	}

	/**
	 * 步驟3: 變更基碼通知交易回應
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0103" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001" ><CHG_KEY_RSP RANDOM_NO=
	 * "7bd63d33890bd954" /></OPCMESSAGE> response :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyResponse() throws Throwable {
		try {
			CHGKEYRSPMessage message = new CHGKEYRSPMessage();
			message.setMSGTYPE( CHGKEYRSPMessage.MESSAGE_TYPE );
			message.setPRCCODE( CHGKEYRSPMessage.PRC_CODE );
			message.setAUDITNO( auditNo );
			message.setORIGIN( tcbConfig.getParticipantId() );
			message.setRSPCODE( OPCMESSAGE.RESPONSE_SUCCESS );

			CHGKEYRSP body = new CHGKEYRSP();
			body.setRANDOMNO( this.randomPlusOne.toLowerCase() );
			message.setBody( body );

			String result = oxmService.marshallOPCMessage( setOPCMessageInfo( message ) );

			logger.info( "step 3. CHGKEYRSPMessage => send change key response to OPC : {}", result );

			opcMessageSender.send( result );

			logger.info( "STEP 3 CHGKEYRSPMessage => msgtype : {}, prccode : {}, origin : {}, ts : {}, auditno : {}, rspcode : {}, result : {}  ",
			        new Object[] { message.getMSGTYPE(), message.getPRCCODE(), message.getORIGIN(), message.getTS(), message.getAUDITNO(), message.getRSPCODE(),
			                result } );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );

			throw new OPCException( "OPC換KEY時失敗！" + cause.toString() );
		}
	}

	/**
	 * 步驟4: 變更基碼通知交易確認
	 * 
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyConfirm() throws Throwable {
		CHGKEYCFRMMessage message = null;
		try {
			String result = opcMessageReceiver.receive();

			logger.info( "step 4. CHGKEYCFRMMessage => receive change key confirm from OPC : {}", result );
			message = oxmService.unMarshallOPCMessage( new CHGKEYCFRMMessage(), result );

			if (!OPCMESSAGE.RESPONSE_SUCCESS.equalsIgnoreCase( message.getRSPCODE() )) {
				// todo throw a exception
				logger.error( "step 4. CHGKEYCFRMMessage => OPC receive change key confirm response code : {}", message.getRSPCODE() );
				throw new OPCException( "CHGKEYCFRMMessage => CHGKEYCFRMMessage : " + message.getPRCCODE() );
			} else if (!message.getBody().getRANDOMNO().toUpperCase().equals( randomPlusTwo.toUpperCase() )) {
				throw new OPCException( " CHGKEYCFRMMessage => RN3 Error : " + message.getBody().getRANDOMNO() );
			}

			// login RA
			logger.info( "step 4. CHGKEYCFRMMessage => Login RA : {}", OpcUtil.loginRA( raFacade, raConfig.getLoginId(), raConfig.getPassword() ) );

			logger.info( "step 4. CHGKEYCFRMMessage => RA replace key result : {}",
			        raFacade.FSSS_ReplaceKey( raFacade.FSRA2_GetKey1(), raConfig.getNewWorkingKey(), raConfig.getWorkingKey(), 0 ) );

			logger.info( "step 4. CHGKEYCFRMMessage => msgtype : {}, prccode : {}, origin : {}, ts : {}, auditno : {}, rspcode : {}, result : {}  ",
			        new Object[] { message.getMSGTYPE(), message.getPRCCODE(), message.getORIGIN(), message.getTS(), message.getAUDITNO(), message.getRSPCODE(),
			                result } );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );

			throw new OPCException( "OPC換KEY時失敗！" + cause.toString() );
		}
	}

	private OPCMESSAGE setOPCMessageInfo(OPCMESSAGE instance) {
		Calendar calendar = Calendar.getInstance();
		instance.setTS( DateFormatUtils.format( calendar, FORMAT_OPC_TIMESTAMP ) );
		instance.setORIGIN( tcbConfig.getParticipantId() );

		return instance;
	}

	public RAFacade2 getRaFacade() {
		return raFacade;
	}

	public void setRaFacade(RAFacade2 raFacade) {
		this.raFacade = raFacade;
	}

}
