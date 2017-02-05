package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.OPENREPO;

/**
 * 附條件交易指令 ：301/ROI
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class OPENREPOMessage extends BCSSMESSAGE
{
    @XmlElement(name = "OPEN_REPO")
    protected OPENREPO body;

	public OPENREPO getBody() {
		return body;
	}

	public void setBody(OPENREPO body) {
		this.body = body;
	}
    
}
