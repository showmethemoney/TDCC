package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.LCNOTIFS;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class LCNOTIFSMessage extends BCSSMESSAGE
{
    @XmlElement(name = "LC_NOTIFS")
    protected LCNOTIFS body;

	public LCNOTIFS getBody() {
		return body;
	}

	public void setBody(LCNOTIFS body) {
		this.body = body;
	}
}
