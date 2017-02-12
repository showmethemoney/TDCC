package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.BcssMessageBean;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.CSHADVICE;

/**
 * 兌償入帳通知：      003/RDM
 * @author Ethan Lee 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class CSHADVICEMessage extends BCSSMESSAGE
{
    public CSHADVICEMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CSHADVICEMessage(BcssMessageBean bcssMessageBean) {
		super( bcssMessageBean.getOrigin(), bcssMessageBean.getTs(), bcssMessageBean.getBcssbusdt(), bcssMessageBean.getMsgtype(), bcssMessageBean.getNarr(),
		        bcssMessageBean.getSndrref(), bcssMessageBean.getAction(), bcssMessageBean.getResend() );
	}
    
	@XmlElement(name = "CSH_ADVICE")
    protected CSHADVICE body;

	public CSHADVICE getBody() {
		return body;
	}

	public void setBody(CSHADVICE body) {
		this.body = body;
	}
    
}
