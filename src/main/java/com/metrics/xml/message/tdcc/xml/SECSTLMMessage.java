package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.SECSTLM;

/**
 * 買賣斷/存券匯撥指令： 401/SSI
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class SECSTLMMessage extends BCSSMESSAGE
{
    public SECSTLMMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public SECSTLMMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		       bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}
    
	@XmlElement(name = "SEC_STLM")
    protected SECSTLM body;

	public SECSTLM getBody() {
		return body;
	}

	public void setBody(SECSTLM body) {
		this.body = body;
	}
    
}
