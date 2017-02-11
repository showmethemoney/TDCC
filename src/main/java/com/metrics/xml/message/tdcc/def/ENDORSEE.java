//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//

package com.metrics.xml.message.tdcc.def;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.metrics.bean.Endorsee;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="END_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="END_ADDR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ENDORSEE")
public class ENDORSEE
{

	@XmlAttribute(name = "END_ID")
	@XmlSchemaType(name = "anySimpleType")
	protected String endid;
	@XmlAttribute(name = "END_ADDR")
	@XmlSchemaType(name = "anySimpleType")
	protected String endaddr;

	public ENDORSEE(Endorsee instance) {
		this( instance.getEndid(), instance.getEndaddr() );
	}

	public ENDORSEE(String endid, String endaddr) {
		super();
		this.endid = endid;
		this.endaddr = endaddr;
	}

	/**
	 * Gets the value of the endid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getENDID() {
		return endid;
	}

	/**
	 * Sets the value of the endid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setENDID(String value) {
		this.endid = value;
	}

	/**
	 * Gets the value of the endaddr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getENDADDR() {
		return endaddr;
	}

	/**
	 * Sets the value of the endaddr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setENDADDR(String value) {
		this.endaddr = value;
	}

}
