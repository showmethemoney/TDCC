package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.ERINST;

/**
 * 提早兌償指令：130 /ER
 * @author ethan
 *
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class ERINSTMessage extends BCSSMESSAGE
{
    @XmlElement(name = "ER_INST")
    protected ERINST body;

	public ERINST getBody() {
		return body;
	}

	public void setBody(ERINST body) {
		this.body = body;
	}
    
}
