package com.metrics.service.message.opc;

import javax.management.RuntimeErrorException;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formosoft.ra.taica2.RAFacade2;
import com.metrics.config.RAConfig;
import com.metrics.config.TCBConfig;
import com.metrics.mq.ibm.OPCMessageReceiver;
import com.metrics.mq.ibm.OPCMessageSender;
import com.metrics.service.message.OXMService;
import com.metrics.utils.OpcUtil;
import com.metrics.xml.message.opc.OPCMESSAGE;
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

	private String auditNo = null;
	private String randomPlusOne = null;
	private String randomPlusTwo = null;
	private RAFacade2 raFacade = null;

	public void start() {
		// set current audit no
		setAuditNo( OpcUtil.newAuditNo() );

		try {
			if (null == raFacade) {
				// throw a exception
				throw new RuntimeException( "please set RAFacade2 instance" );
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 1. 閬���蝣潮�鈭斗����
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0101" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085000" RSP_CODE="0001" ><CHG_KEY_REQ/></OPCMESSAGE>
	 * reseponse :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0102" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001"><CHG_KEY KEY_ID="02" NEW_KEY=
	 * "7B111F157B396BAF80EC30A0071A47B6" RANDOM_NO="B6E9BC3BA229C61D"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyRequest() {
		try {
			CHGKEYREQMessage message = new CHGKEYREQMessage();

			message.setMSGTYPE( CHGKEYREQMessage.MESSAGE_TYPE );
			message.setPRCCODE( CHGKEYREQMessage.PRC_CODE );
			message.setAUDITNO( getAuditNo() );
			message.setORIGIN( tcbConfig.getParticipantId() );

			String result = oxmService.marshallOPCMessage( message );

			logger.info( "step 1. send change key request to OPC : {}", result );

			opcMessageSender.send( result );
			// todo write database ?
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 2. 閬���蝣潮�鈭斗����
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0102" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001"><CHG_KEY KEY_ID="02" NEW_KEY=
	 * "7B111F157B396BAF80EC30A0071A47B6" RANDOM_NO="B6E9BC3BA229C61D"/></OPCMESSAGE>
	 */
	protected void sendChangeKey() {
		CHGKEYMessage message = null;
		try {
			String result = opcMessageReceiver.receive();

			logger.info( "step 2. receive change key from OPC : {}", result );
			message = oxmService.unMarshallOPCMessage( new CHGKEYMessage(), result );

			if (!OPCMESSAGE.RESPONSE_SUCCESS.equalsIgnoreCase( message.getRSPCODE() )) {
				// todo throw a exception
			}

			if (0 != raFacade.FSRA2_Login( raConfig.getLoginId(), OpcUtil.passwordHash( raConfig.getPassword() ), "" )) {
				// todo throw a exception
			}

			int importResult = raFacade.FSSS_ImportKeyAndRandom( raFacade.FSRA2_GetKey1(), raConfig.getCdKey(), raConfig.getNewWorkingKey(),
			        OpcUtil.pack( message.getBody().getNEWKEY(), 32 ), a, OpcUtil.pack( message.getBody().getRANDOMNO(), 16 ), 544 );

			if (0 != importResult) {
				// todo throw a exception
			} else {
				randomPlusOne = raFacade.FSSS_GetEncryptedRandomPlusOne(); // RN + 1
				randomPlusTwo = raFacade.FSSS_GetEncryptedRandomPlusTwo(); // RN + 2
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 3. 霈�蝣潮�鈭斗����
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0103" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001" ><CHG_KEY_RSP RANDOM_NO=
	 * "7bd63d33890bd954" /></OPCMESSAGE> response :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyResponse() {
		try {
			if (null == raFacade) {
				// throw a exception
				throw new RuntimeException( "please set RAFacade2 instance" );
			}

			CHGKEYRSPMessage message = new CHGKEYRSPMessage();
			message.setMSGTYPE( CHGKEYRSPMessage.MESSAGE_TYPE );
			message.setPRCCODE( CHGKEYRSPMessage.PRC_CODE );
			message.setORIGIN( tcbConfig.getParticipantId() );
			message.setRSPCODE( OPCMESSAGE.RESPONSE_SUCCESS );

			CHGKEYRSP body = new CHGKEYRSP();
			body.setRANDOMNO( this.randomPlusOne.toLowerCase() );
			message.setBody( body );

			String result = oxmService.marshallOPCMessage( message );

			logger.info( "step 3. send change key response to OPC : {}", result );

			opcMessageSender.send( result );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 4. 霈�蝣潮�鈭斗�Ⅱ隤� send :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyConfirm() {
		CHGKEYCFRMMessage message = null;
		try {
			String result = opcMessageReceiver.receive();

			logger.info( "step 4. receive change key confirm from OPC : {}", result );
			message = oxmService.unMarshallOPCMessage( new CHGKEYCFRMMessage(), result );

			if (!OPCMESSAGE.RESPONSE_SUCCESS.equalsIgnoreCase( message.getRSPCODE() )) {
				// todo throw a exception
			} else if (!message.getBody().getRANDOMNO().toUpperCase().equals( randomPlusTwo.toUpperCase() )) {

			}

			// login RA
			logger.info( "Login RA : {}", raFacade.FSRA2_Login( raConfig.getLoginId(), OpcUtil.passwordHash( raConfig.getPassword() ), "" ) );

			logger.info( "RA replace key : {}", raFacade.FSSS_ReplaceKey( raFacade.FSRA2_GetKey1(), raConfig.getNewWorkingKey(), raConfig.getWorkingKey(), 0 ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	public String getAuditNo() {
		return auditNo;
	}

	public void setAuditNo(String auditNo) {
		this.auditNo = auditNo;
	}

	public String getRandomPlusOne() {
		return randomPlusOne;
	}

	public void setRandomPlusOne(String randomPlusOne) {
		this.randomPlusOne = randomPlusOne;
	}

	public String getRandomPlusTwo() {
		return randomPlusTwo;
	}

	public void setRandomPlusTwo(String randomPlusTwo) {
		this.randomPlusTwo = randomPlusTwo;
	}

	public RAFacade2 getRaFacade() {
		return raFacade;
	}

	public void setRaFacade(RAFacade2 raFacade) {
		this.raFacade = raFacade;
	}

}
