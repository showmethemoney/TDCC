package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
    @XmlElement(name = "MOD_REPO")
    protected MODREPO body;

	public MODREPO getBody() {
		return body;
	}

	public void setBody(MODREPO body) {
		this.body = body;
	}
    
}
