package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.REIINST;

/**
 * 續發指令：123/RI 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class REIINSTMessage extends BCSSMESSAGE
{
    @XmlElement(name = "REI_INST")
    protected REIINST body;

	public REIINST getBody() {
		return body;
	}

	public void setBody(REIINST body) {
		this.body = body;
	}
}
