package com.metrics.xml.message.opc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.CHGKEYRSP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "OPCMESSAGE")
public class CHGKEYRSPMessage extends OPCMESSAGE
{
	@XmlElement(name = "CHG_KEY_RSP")
	protected CHGKEYRSP body;

	public CHGKEYRSP getBody() {
		return body;
	}

	public void setBody(CHGKEYRSP body) {
		this.body = body;
	}
}