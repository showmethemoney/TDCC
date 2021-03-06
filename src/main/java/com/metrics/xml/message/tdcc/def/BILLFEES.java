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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UND_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CERT_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GUT_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNSG_FEE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HEAL_INSU_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BILL_FEES")
public class BILLFEES {

    @XmlAttribute(name = "UND_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String undfee;
    @XmlAttribute(name = "CERT_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String certfee;
    @XmlAttribute(name = "GUT_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String gutfee;
    @XmlAttribute(name = "CNSG_FEE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cnsgfee;
    @XmlAttribute(name = "HEAL_INSU_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String healinsufee;

    public BILLFEES() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     * Gets the value of the undfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDFEE() {
        return undfee;
    }

    /**
     * Sets the value of the undfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDFEE(String value) {
        this.undfee = value;
    }

    /**
     * Gets the value of the certfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTFEE() {
        return certfee;
    }

    /**
     * Sets the value of the certfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTFEE(String value) {
        this.certfee = value;
    }

    /**
     * Gets the value of the gutfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUTFEE() {
        return gutfee;
    }

    /**
     * Sets the value of the gutfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUTFEE(String value) {
        this.gutfee = value;
    }

    /**
     * Gets the value of the cnsgfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNSGFEE() {
        return cnsgfee;
    }

    /**
     * Sets the value of the cnsgfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNSGFEE(String value) {
        this.cnsgfee = value;
    }

    /**
     * Gets the value of the healinsufee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEALINSUFEE() {
        return healinsufee;
    }

    /**
     * Sets the value of the healinsufee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEALINSUFEE(String value) {
        this.healinsufee = value;
    }

}
