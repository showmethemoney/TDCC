package com.metrics.xml.message.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.LCNOTIFP;
import com.metrics.xml.message.BCSSMESSAGE;


/**
 * @author Ethan Lee
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class LCNOTIFPMessage extends BCSSMESSAGE
{	
	@XmlElement(name = "LC_NOTIFP")
	protected LCNOTIFP body = null;
	 
	public LCNOTIFP getBody() {
		return body;
	}

	public void setBody(LCNOTIFP body) {
		this.body = body;
	}
	
}
