package com.metrics.xml.message.opc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.KEYSYNCRSP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "OPCMESSAGE")
public class KEYSYNCRSPMessage extends OPCMESSAGE
{
    @XmlElement(name = "KEY_SYNC_RSP")
    protected KEYSYNCRSP body;

	public KEYSYNCRSP getBody() {
		return body;
	}

	public void setBody(KEYSYNCRSP body) {
		this.body = body;
	}
    
}
