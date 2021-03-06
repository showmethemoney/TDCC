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

import com.metrics.bean.RepSecVal;

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
 *       &lt;attribute name="ITEM_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ITEM_VAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "REP_SEC_VAL")
public class REPSECVAL
{

	public REPSECVAL() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "ITEM_NM")
	@XmlSchemaType(name = "anySimpleType")
	protected String itemnm;
	@XmlAttribute(name = "ITEM_VAL")
	@XmlSchemaType(name = "anySimpleType")
	protected String itemval;

	public REPSECVAL(RepSecVal instance) {
		this( instance.getItemnm(), instance.getItemval() );
	}

	public REPSECVAL(String itemnm, String itemval) {
		super();
		this.itemnm = itemnm;
		this.itemval = itemval;
	}

	/**
	 * Gets the value of the itemnm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getITEMNM() {
		return itemnm;
	}

	/**
	 * Sets the value of the itemnm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setITEMNM(String value) {
		this.itemnm = value;
	}

	/**
	 * Gets the value of the itemval property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getITEMVAL() {
		return itemval;
	}

	/**
	 * Sets the value of the itemval property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setITEMVAL(String value) {
		this.itemval = value;
	}

}
