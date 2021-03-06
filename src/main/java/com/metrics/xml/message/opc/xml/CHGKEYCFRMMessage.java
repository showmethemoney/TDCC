package com.metrics.xml.message.opc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.CHGKEYCFRM;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "OPCMESSAGE")
public class CHGKEYCFRMMessage extends OPCMESSAGE
{
	@XmlTransient
	public static final String MESSAGE_TYPE = "0100";
	@XmlTransient
	public static final String PRC_CODE = "0104";
	
	public CHGKEYCFRMMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "CHG_KEY_CFRM")
	protected CHGKEYCFRM body;

	public CHGKEYCFRM getBody() {
		return body;
	}

	public void setBody(CHGKEYCFRM body) {
		this.body = body;
	}

}
