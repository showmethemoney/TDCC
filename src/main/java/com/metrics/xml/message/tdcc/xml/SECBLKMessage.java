package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.SECBLK;

/**
 * 圈券指令：403/BI(SEC_BLK) 解除圈券指令：403/UI(SEC_BLK)
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class SECBLKMessage extends BCSSMESSAGE
{
	public SECBLKMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SECBLKMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		        bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}

	@XmlElement(name = "SEC_BLK")
	protected SECBLK body;

	public SECBLK getBody() {
		return body;
	}

	public void setBody(SECBLK body) {
		this.body = body;
	}

}
