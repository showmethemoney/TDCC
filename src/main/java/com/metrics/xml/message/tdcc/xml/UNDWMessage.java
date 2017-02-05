package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.UNDW;

/**
 * 包銷/首買指令：110/UI
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class UNDWMessage extends BCSSMESSAGE
{
    @XmlElement(name = "UNDW")
    protected UNDW body;

	public UNDW getBody() {
		return body;
	}

	public void setBody(UNDW body) {
		this.body = body;
	}
    
}
