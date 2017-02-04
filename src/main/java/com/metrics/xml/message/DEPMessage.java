package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.DEP;

/**
 * 送存指令：             101/DI
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class DEPMessage extends BCSSMESSAGE
{
	@XmlElement(name = "DEP")
	protected DEP body;

	public DEP getBody() {
		return body;
	}

	public void setBody(DEP body) {
		this.body = body;
	}
	
}
