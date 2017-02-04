package com.metrics.xml.message.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.CSHPRIORITY;
import com.metrics.xml.message.BCSSMESSAGE;

/**
 * @author Ethan Lee 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class CSHPRIORITYMessage extends BCSSMESSAGE
{
    @XmlElement(name = "CSH_PRIORITY")
    protected CSHPRIORITY body;

	public CSHPRIORITY getBody() {
		return body;
	}

	public void setBody(CSHPRIORITY body) {
		this.body = body;
	}
}
