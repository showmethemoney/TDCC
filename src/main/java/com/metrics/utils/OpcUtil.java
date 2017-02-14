package com.metrics.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.formosoft.ra.taica2.RAFacade2;


/**
 * 本類別負責提供處理 OPC 訊息相關工具方法， 包含:產生流水編號、時間戳記、訊息編號、設定狀態等等。
 */
public class OpcUtil
{

	/**
	 * 設定流水編號(7碼，不可重複)
	 * 
	 * @return 流水編號
	 */
	public static synchronized String newAuditNo() {
		String seq = String.valueOf( Calendar.getInstance().getTimeInMillis() );
		// TODO: 確認流水號唯一性做法
		// return "1" + seq.substring(seq.length() - 7);
		return "1" + seq.substring( seq.length() - 6 );
	}

	/**
	 * 取得OPC訊息時間戳記(YYYYMMDDHHMMSS 14碼)
	 * 
	 * @return OPC 訊息時間戳記
	 */
	public static String getOpcTS() {
		return new SimpleDateFormat( "yyyyMMddHHmmss" ).format( Calendar.getInstance() );
	}

	/**
	 * 取得MsgId(For MQ)
	 * 
	 * @param partyid
	 *            使用單位代號
	 * @param audit_no
	 *            流水編號
	 * @param prc_code
	 *            作業代號
	 * @return MsgId
	 */
	public static synchronized String getMsgId(String partyid, String audit_no, String prc_code) {
		String data = new java.text.SimpleDateFormat( "yyyyMMdd" ).format( new java.util.Date() );
		String msgid = partyid + data + audit_no + prc_code; // 8+6+7+4=25
		
		return msgid;
	}

	/**
	 * 設定OPC目前狀態，OPC狀態會記錄在OPC記錄檔內
	 * 
	 * @param Path
	 *            OPC記錄檔位置
	 * @return OPC目前狀態
	 */
	public static synchronized String[] setStatus(String Path) {
		return setStatus( Path, "" );
	}

	/**
	 * 設定OPC目前狀態，OPC狀態會記錄在OPC記錄檔內
	 * 
	 * @param Path
	 *            OPC記錄檔位置
	 * @param isOK
	 *            狀態
	 * @param 時間參數
	 * @return OPC目前狀態
	 */
	public static synchronized String[] setStatus(String Path, String isOK) {
		return setStatus( Path, isOK, "" );
	}

	/**
	 * 設定OPC目前狀態，OPC狀態會記錄在OPC記錄檔內
	 * 
	 * @param Path
	 *            OPC記錄檔位置
	 * @param isOK
	 *            狀態
	 * @return OPC目前狀態
	 */
	public static synchronized String[] setStatus(String Path, String isOK, String sTime) {
		boolean hasError = false;
		String[] sStatus = { "Y", "999999" };
		String sFileName = Path + "psp.opc.status.conf";

		// 檢查檔案是否存在
		File file = new File( sFileName );
		if (!file.exists()) {
			System.out.println( "***** OPC conf 檔案不存在! sFileName = " + sFileName );
		}

		try {
			BufferedReader in = new BufferedReader( new FileReader( sFileName ) );
			String sValue = in.readLine();
			if (sValue == null)
				throw new IOException();
			int ipos = sValue.indexOf( "-" );
			if (ipos == -1)
				throw new IOException();
			sStatus[1] = String.valueOf( Long.parseLong( sValue.substring( 0, ipos ) ) );
			sStatus[0] = sValue.substring( ipos + 1, sValue.length() );
			in.close();
			// System.out.println("***** OPC conf(1): sStatus[0] = " + sStatus[0] + ", sStatus[1] = " + sStatus[1]);
		} catch (Exception e) {
			hasError = true;
			System.out.println( e );
		}

		try {
			if (hasError || (isOK.equals( "Y" ) || isOK.equals( "N" )) || !sTime.equals( "" )) {
				if (!isOK.equals( "" ))
					sStatus[0] = isOK;
				if (!sTime.equals( "" )) {
					sStatus[1] = sTime;
				}
				PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter( sFileName ) ) );
				out.println( sStatus[1] + "-" + sStatus[0] );
				out.close();
				// System.out.println("***** OPC conf(2): sStatus[0] = " + sStatus[0] + ", sStatus[1] = " + sStatus[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return sStatus;
	}

	/**
	 * 登入RA系統
	 * 
	 * @param ra
	 *            RA處理物件
	 * @return 登入成功與否，0->成功；Others->錯誤代碼
	 * @throws NoSuchAlgorithmException
	 * @throws OpcException
	 */
	public static int loginRA(RAFacade2 ra) throws NoSuchAlgorithmException, OpcException {
		LogService log = LogFactory.get( LogFactory.LOG_HOST );
		String pastr = OpcUtil.passwordHash( GWManager.conf.getOpcRAPassword() );
		int LoginResult = ra.FSRA2_Login( GWManager.conf.getOpcRALoginID(), pastr, "" );
		if (LoginResult == 0) {
			return LoginResult;
		} else {
			log.error( "ra.FSRA2_GetErrorMsg() = " + ra.FSRA2_GetErrorMsg() );
			throw new OpcException( "LoginRA()->Error = " + ra.FSRA2_GetErrorMsg() );
		}
	}

	/**
	 * 將密碼資料轉成Hex字串回傳
	 * 
	 * @param password
	 *            密碼資料
	 * @return Hex字串
	 * @throws NoSuchAlgorithmException
	 */
	public static String passwordHash(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance( "SHA" );
		String str = new String();
		str = toHexString( md.digest( password.getBytes() ) );
		return str.toUpperCase();
	}

	/**
	 * 將Byte資料轉成Hex字串
	 * 
	 * @param s
	 *            Byte資料
	 * @return Hex字串
	 */
	public static String toHexString(byte[] s) {
		String str = "";
		for (int i = 0; i < s.length; i++) {
			int ch = (int) s[i];
			String s1 = Integer.toHexString( ch );
			String s4;
			int len = s1.length();
			if (len == 1) {
				s4 = "0";
				s4 += s1;
			} else if (len == 2) {
				s4 = s1;
			} else {
				s4 = s1.substring( len - 2, len );
			}
			str += s4;
		}
		return str;
	}

	/**
	 * Pack String (HEX->INT)，OPC時使用
	 * 
	 * @param value
	 *            來源字串
	 * @param len
	 *            長度
	 * @return Pack後之值
	 */
	public static byte[] pack(String value, int len) {
		int i;
		byte[] temp = new byte[len];

		byte[] key_value = new byte[len / 2];
		temp = value.getBytes();

		for (i = 0; i < len; i++) {
			// the character between 0 to 9
			if ((temp[i] >= 48) && (temp[i] <= 57)) {
				temp[i] = (byte) (temp[i] - 48);
				// the character between A to F
			} else if ((temp[i] >= 65) && (temp[i] <= 70)) {
				temp[i] = (byte) (temp[i] - 65 + 10);
				// the character between a to f
			} else if ((temp[i] >= 97) && (temp[i] <= 102)) {
				temp[i] = (byte) (temp[i] - 97 + 10);
			}
		}
		for (i = 0; i < (len / 2); i++) {
			key_value[i] = (byte) (temp[i * 2] * 16 + temp[i * 2 + 1]);
		}
		return key_value;
	}

	/**
	 * 將字串轉成 Byte Array。
	 * @param str 資料字串
	 * @return Byte Array
	 */
	public static byte[] HexStringToByteArray(String str) {
		byte[] buf = new byte[str.length()/2];
		for(int i=0;i<str.length()/2;i++) {
			buf[i] = (byte)Integer.parseInt(str.substring(i*2,(i+1)*2),16);
		}
		return buf;
	}
}
