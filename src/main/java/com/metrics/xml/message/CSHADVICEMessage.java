package com.metrics.xml.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.def.CSHADVICE;

/**
 * @author Ethan Lee 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cshadvice" })
@XmlRootElement(name = "BCSSMESSAGE")
public class CSHADVICEMessage extends BCSSMESSAGE
{
    @XmlElement(name = "CSH_ADVICE")
    protected CSHADVICE cshadvice;

	public CSHADVICE getCshadvice() {
		return cshadvice;
	}

	public void setCshadvice(CSHADVICE cshadvice) {
		this.cshadvice = cshadvice;
	}
    
}
