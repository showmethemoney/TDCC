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
 *       &lt;attribute name="CRIT_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CRIT_VAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CRIT")
public class CRIT {

    @XmlAttribute(name = "CRIT_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String critnm;
    @XmlAttribute(name = "CRIT_VAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String critval;

    /**
     * Gets the value of the critnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITNM() {
        return critnm;
    }

    /**
     * Sets the value of the critnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITNM(String value) {
        this.critnm = value;
    }

    /**
     * Gets the value of the critval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITVAL() {
        return critval;
    }

    /**
     * Sets the value of the critval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITVAL(String value) {
        this.critval = value;
    }

}