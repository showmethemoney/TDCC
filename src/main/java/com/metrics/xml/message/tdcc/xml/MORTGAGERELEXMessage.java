package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.def.MORTGAGERELEX;

/**
 * 202/MEI	撖西�釭甈�誘
 * 202/MR	鞈芣����誘
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class MORTGAGERELEXMessage
{
    @XmlElement(name = "MORTGAGE_RELEX")
    protected MORTGAGERELEX body;

	public MORTGAGERELEX getBody() {
		return body;
	}

	public void setBody(MORTGAGERELEX body) {
		this.body = body;
	}
}
