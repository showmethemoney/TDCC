package com.metrics.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formosoft.ra.taica2.RAFacade2;
import com.metrics.config.RAConfig;
import com.metrics.exception.OPCException;

/**
 * 本類別負責提供 MAC 處理相關方法。
 */
@Component
public class OpcMacUtil
{

	/** 本物件負責記錄 OPC 處理步驟相關的紀錄 */
	protected static final Logger logger = LoggerFactory.getLogger( OpcMacUtil.class );

	@Autowired
	private RAConfig raConfig = null;
	@Autowired
	private RAFacade2 raFacade = null;

	/**
	 * 根據訊息內容產生 MAC 值
	 * 
	 * @param msg
	 *            訊息內容 byte 值
	 * @return MAC 字串
	 * @throws OpcException
	 */
	public synchronized String generateMAC(byte[] msg) throws OPCException {
		try {
			OpcUtil.loginRA( raFacade, raConfig.getLoginId(), raConfig.getPassword() );

			if (0 == raFacade.FSSS_GenerateMAC( raFacade.FSRA2_GetKey1(), raConfig.getWorkingKey(), new byte[8], msg, 0x02 | 0x08 | 0x20 )) {
				return raFacade.FSSS_GetSymKeyMAC().substring( 32, 40 );
			} else { // 押碼失敗
				throw new OPCException();
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw new OPCException( cause.toString() );
		}
	}

	/**
	 * 檢查集保送來的 XML 電文的 OPC MAC 值是否正確
	 * 
	 * @param bmsg
	 *            XML 電文(只含要確認押碼的訊息部分)
	 * @param mac
	 *            OPC MAC 值
	 * @return OPC MAC 值正確與否
	 * @throws OpcException
	 */
	public boolean verifyMAC(byte[] bmsg, String mac) throws OPCException {

		try {
			OpcUtil.loginRA( raFacade, raConfig.getLoginId(), raConfig.getPassword() );

			int rtn = raFacade.FSSS_GenerateMAC( raFacade.FSRA2_GetKey1(), raConfig.getWorkingKey(), new byte[8], bmsg, 0x02 | 0x08 | 0x20 );
			
			String newMac = raFacade.FSSS_GetSymKeyMAC().substring( 32, 40 );
			logger.info( "FSSS_GenerateMAC -> rtn = {}, mac = {}, newMac = {} ", new Object[] { rtn, mac, newMac } );

			if (!newMac.toLowerCase().equals( mac.toLowerCase() )) {
				logger.error( "MAC ERROR -> PSP MAC = {}, MSG MAC = {} ", newMac, mac );

				return false;
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw new OPCException( cause.toString() );
		}

		return true;
	}
}