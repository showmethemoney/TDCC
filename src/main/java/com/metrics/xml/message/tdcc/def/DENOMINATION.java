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

import com.metrics.bean.Denomination;

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
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FVAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UNITS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HIST_TAX" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DENOMINATION")
public class DENOMINATION
{

	@XmlAttribute(name = "ID", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String id;
	@XmlAttribute(name = "FVAL", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String fval;
	@XmlAttribute(name = "UVAL", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String uval;
	@XmlAttribute(name = "UNITS", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String units;
	@XmlAttribute(name = "HIST_TAX")
	@XmlSchemaType(name = "anySimpleType")
	protected String histtax;

	public DENOMINATION(Denomination instance) {
		this( instance.getId(), instance.getFval(), instance.getUval(), instance.getUnits(), instance.getHisttax() );
	}

	public DENOMINATION(String id, String fval, String uval, String units, String histtax) {
		super();
		this.id = id;
		this.fval = fval;
		this.uval = uval;
		this.units = units;
		this.histtax = histtax;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setID(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the fval property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFVAL() {
		return fval;
	}

	/**
	 * Sets the value of the fval property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFVAL(String value) {
		this.fval = value;
	}

	/**
	 * Gets the value of the uval property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUVAL() {
		return uval;
	}

	/**
	 * Sets the value of the uval property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUVAL(String value) {
		this.uval = value;
	}

	/**
	 * Gets the value of the units property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUNITS() {
		return units;
	}

	/**
	 * Sets the value of the units property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUNITS(String value) {
		this.units = value;
	}

	/**
	 * Gets the value of the histtax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHISTTAX() {
		return histtax;
	}

	/**
	 * Sets the value of the histtax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHISTTAX(String value) {
		this.histtax = value;
	}

}
