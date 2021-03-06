package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.MORTGAGEREGEX;

/**
 * 設定質權指令：  201/MRI
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class MORTGAGEREGEXMessage extends BCSSMESSAGE
{

	public MORTGAGEREGEXMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MORTGAGEREGEXMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		        bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}
	
	@XmlElement(name = "MORTGAGE_REGEX")
	protected MORTGAGEREGEX body;

	public MORTGAGEREGEX getBody() {
		return body;
	}

	public void setBody(MORTGAGEREGEX body) {
		this.body = body;
	}

}
