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
 * �����O�t�d���ѳB�z OPC �T�������u���k�A �]�t:���ͬy���s���B�ɶ��W�O�B�T���s���B�]�w���A�����C
 */
public class OpcUtil
{

	/**
	 * �]�w�y���s��(7�X�A���i����)
	 * 
	 * @return �y���s��
	 */
	public static synchronized String newAuditNo() {
		String seq = String.valueOf( Calendar.getInstance().getTimeInMillis() );
		// TODO: �T�{�y�����ߤ@�ʰ��k
		// return "1" + seq.substring(seq.length() - 7);
		return "1" + seq.substring( seq.length() - 6 );
	}

	/**
	 * ��oOPC�T���ɶ��W�O(YYYYMMDDHHMMSS 14�X)
	 * 
	 * @return OPC �T���ɶ��W�O
	 */
	public static String getOpcTS() {
		return new SimpleDateFormat( "yyyyMMddHHmmss" ).format( Calendar.getInstance() );
	}

	/**
	 * ��oMsgId(For MQ)
	 * 
	 * @param partyid
	 *            �ϥγ��N��
	 * @param audit_no
	 *            �y���s��
	 * @param prc_code
	 *            �@�~�N��
	 * @return MsgId
	 */
	public static synchronized String getMsgId(String partyid, String audit_no, String prc_code) {
		String data = new java.text.SimpleDateFormat( "yyyyMMdd" ).format( new java.util.Date() );
		String msgid = partyid + data + audit_no + prc_code; // 8+6+7+4=25
		
		return msgid;
	}

	/**
	 * �]�wOPC�ثe���A�AOPC���A�|�O��bOPC�O���ɤ�
	 * 
	 * @param Path
	 *            OPC�O���ɦ�m
	 * @return OPC�ثe���A
	 */
	public static synchronized String[] setStatus(String Path) {
		return setStatus( Path, "" );
	}

	/**
	 * �]�wOPC�ثe���A�AOPC���A�|�O��bOPC�O���ɤ�
	 * 
	 * @param Path
	 *            OPC�O���ɦ�m
	 * @param isOK
	 *            ���A
	 * @param �ɶ��Ѽ�
	 * @return OPC�ثe���A
	 */
	public static synchronized String[] setStatus(String Path, String isOK) {
		return setStatus( Path, isOK, "" );
	}

	/**
	 * �]�wOPC�ثe���A�AOPC���A�|�O��bOPC�O���ɤ�
	 * 
	 * @param Path
	 *            OPC�O���ɦ�m
	 * @param isOK
	 *            ���A
	 * @return OPC�ثe���A
	 */
	public static synchronized String[] setStatus(String Path, String isOK, String sTime) {
		boolean hasError = false;
		String[] sStatus = { "Y", "999999" };
		String sFileName = Path + "psp.opc.status.conf";

		// �ˬd�ɮ׬O�_�s�b
		File file = new File( sFileName );
		if (!file.exists()) {
			System.out.println( "***** OPC conf �ɮפ��s�b! sFileName = " + sFileName );
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
	 * �n�JRA�t��
	 * 
	 * @param ra
	 *            RA�B�z����
	 * @return �n�J���\�P�_�A0->���\�FOthers->��~�N�X
	 * @throws NoSuchAlgorithmException
	 * @throws OpcException
	 */
//	public static int loginRA(RAFacade2 ra) throws NoSuchAlgorithmException, OpcException {
//		LogService log = LogFactory.get( LogFactory.LOG_HOST );
//		String pastr = OpcUtil.passwordHash( GWManager.conf.getOpcRAPassword() );
////		int LoginResult = ra.FSRA2_Login( GWManager.conf.getOpcRALoginID(), pastr, "" );
//		if (LoginResult == 0) {
//			return LoginResult;
//		} else {
//			log.error( "ra.FSRA2_GetErrorMsg() = " + ra.FSRA2_GetErrorMsg() );
//			throw new OpcException( "LoginRA()->Error = " + ra.FSRA2_GetErrorMsg() );
//		}
//	}

	/**
	 * �N�K�X����নHex�r��^��
	 * 
	 * @param password
	 *            �K�X���
	 * @return Hex�r��
	 * @throws NoSuchAlgorithmException
	 */
	public static String passwordHash(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance( "SHA" );
		String str = new String();
		str = toHexString( md.digest( password.getBytes() ) );
		return str.toUpperCase();
	}

	/**
	 * �NByte����নHex�r��
	 * 
	 * @param s
	 *            Byte���
	 * @return Hex�r��
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
	 * Pack String (HEX->INT)�AOPC�ɨϥ�
	 * 
	 * @param value
	 *            �ӷ��r��
	 * @param len
	 *            ���
	 * @return Pack�ᤧ��
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
	 * �N�r���ন Byte Array�C
	 * @param str ��Ʀr��
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
