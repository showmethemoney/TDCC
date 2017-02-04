package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.REPREQ;

/**
 * 報表查詢：005/RPRQ (REP_REQ)
 * 
 * @author ethan
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class REPREQMessage extends BCSSMESSAGE
{
	@XmlElement(name = "REP_REQ")
	protected REPREQ body;

	public REPREQ getBody() {
		return body;
	}

	public void setBody(REPREQ body) {
		this.body = body;
	}

}
