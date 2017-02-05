package com.metrics.xml.message.opc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.KEYSYNC;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "OPCMESSAGE")
public class KEYSYNCMessage extends OPCMESSAGE
{
	@XmlElement(name = "KEY_SYNC")
	protected KEYSYNC body;

	public KEYSYNC getBody() {
		return body;
	}

	public void setBody(KEYSYNC body) {
		this.body = body;
	}

}
