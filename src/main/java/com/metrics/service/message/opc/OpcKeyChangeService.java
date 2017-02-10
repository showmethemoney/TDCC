package com.metrics.service.message.opc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.formosoft.ra.taica2.RAFacade2;
import com.metrics.utils.OpcUtil;
import com.metrics.xml.message.opc.xml.CHGKEYCFRMMessage;
import com.metrics.xml.message.opc.xml.CHGKEYMessage;
import com.metrics.xml.message.opc.xml.CHGKEYREQMessage;
import com.metrics.xml.message.opc.xml.CHGKEYRSPMessage;

/**
 * @author Ethan Lee
 */
public class OpcKeyChangeService
{
	protected static final Logger logger = LoggerFactory.getLogger( OpcKeyChangeService.class );

	/** RA 處理物件 */
	private RAFacade2 ra;

	public void start() {
		try {

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 1. 要求變更基碼通知交易請求
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

			message.setAUDITNO( OpcUtil.newAuditNo() );
			message.setORIGIN( "" );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 2. 要求變更基碼通知交易回應
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0102" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001"><CHG_KEY KEY_ID="02" NEW_KEY=
	 * "7B111F157B396BAF80EC30A0071A47B6" RANDOM_NO="B6E9BC3BA229C61D"/></OPCMESSAGE>
	 */
	protected void sendChangeKey() {
		CHGKEYMessage message = null;
		try {

			new CHGKEYMessage();

			OpcUtil.loginRA( ra );

//			int rst = ra.FSSS_ImportKeyAndRandom( ra.FSRA2_GetKey1(), this.conf.getOpcCDKey(), this.conf.getOpcWorkingKeyNew(),
//			        OpcUtil.pack( message.getBody().getNEWKEY(), 32 ), a, OpcUtil.pack( message.getBody().getRANDOMNO(), 16 ), 544 );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 3. 變更基碼通知交易回應
	 * 
	 * send : <?xml version = "1.0" encoding = "UTF-8"?>
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0103" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085013" RSP_CODE="0001" ><CHG_KEY_RSP RANDOM_NO=
	 * "7bd63d33890bd954" /></OPCMESSAGE> response :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyResponse() {
		try {

			new CHGKEYRSPMessage();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * 4. 變更基碼通知交易確認 send :
	 * <OPCMESSAGE MSG_TYPE="0100" PRC_CODE="0104" AUDIT_NO="0000001" ORIGIN="B0060000" TS="20161123085019" RSP_CODE="0001"><CHG_KEY_CFRM RANDOM_NO=
	 * "374952B249A831A9"/></OPCMESSAGE>
	 */
	protected void sendChangeKeyConfirm() {
		try {

			new CHGKEYCFRMMessage();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}