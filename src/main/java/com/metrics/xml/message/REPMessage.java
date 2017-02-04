package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.REP;

/**
 * 報表查詢結果：006/REP
 * @author ethan
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class REPMessage extends BCSSMESSAGE
{ 
    @XmlElement(name = "REP")
    protected REP body;

	public REP getBody() {
		return body;
	}

	public void setBody(REP body) {
		this.body = body;
	}
    
}
