package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.CONSIGNTINST;

/**
 * 代銷指令：112/CI
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class CONSIGNTINSTMessage extends BCSSMESSAGE
{

	@XmlElement(name = "CONSIGNT_INST")
	protected CONSIGNTINST body;

	public CONSIGNTINST getBody() {
		return body;
	}

	public void setBody(CONSIGNTINST body) {
		this.body = body;
	}

}
