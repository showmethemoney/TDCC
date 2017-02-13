package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.MODREPO;

/**
 * 附條件交易中途解約指令：303/RCMI
 * @author ethan
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class MODREPOMessage extends BCSSMESSAGE
{
    public MODREPOMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MODREPOMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		        bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}
    
	@XmlElement(name = "MOD_REPO")
    protected MODREPO body;

	public MODREPO getBody() {
		return body;
	}

	public void setBody(MODREPO body) {
		this.body = body;
	}
    
}
