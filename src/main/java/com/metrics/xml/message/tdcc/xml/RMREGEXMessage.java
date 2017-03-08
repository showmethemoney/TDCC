package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.RMREGEX;

/**
 * 附條件質權設定指令：205/RMRI 
 * 
 * @author ethan
 *
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class RMREGEXMessage extends BCSSMESSAGE
{
	public RMREGEXMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RMREGEXMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		       bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}

	@XmlElement(name = "RM_REGEX")
	protected RMREGEX body;

	public RMREGEX getBody() {
		return body;
	}

	public void setBody(RMREGEX body) {
		this.body = body;
	}
}
