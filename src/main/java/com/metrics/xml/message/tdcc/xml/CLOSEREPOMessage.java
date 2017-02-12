package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.CLOSEREPO;

/**
 * 附條件交易到期履約指令：302/RCI
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class CLOSEREPOMessage extends BCSSMESSAGE
{
	public CLOSEREPOMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CLOSEREPOMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		       bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}

	@XmlElement(name = "CLOSE_REPO")
	protected CLOSEREPO body;

	public CLOSEREPO getBody() {
		return body;
	}

	public void setBody(CLOSEREPO body) {
		this.body = body;
	}

}
