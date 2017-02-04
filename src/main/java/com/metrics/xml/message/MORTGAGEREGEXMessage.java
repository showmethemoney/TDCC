package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.MORTGAGEREGEX;

/**
 * 設定質權指令：  201/MRI
 * 
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class MORTGAGEREGEXMessage extends BCSSMESSAGE
{

	@XmlElement(name = "MORTGAGE_REGEX")
	protected MORTGAGEREGEX body;

	public MORTGAGEREGEX getBody() {
		return body;
	}

	public void setBody(MORTGAGEREGEX body) {
		this.body = body;
	}

}
