//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.def;

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
 *       &lt;attribute name="AGR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AGRM_REF" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AGREER")
public class AGREER {

    @XmlAttribute(name = "AGR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String agrid;
    @XmlAttribute(name = "AGRM_REF", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String agrmref;

    /**
     * Gets the value of the agrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRID() {
        return agrid;
    }

    /**
     * Sets the value of the agrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRID(String value) {
        this.agrid = value;
    }

    /**
     * Gets the value of the agrmref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRMREF() {
        return agrmref;
    }

    /**
     * Sets the value of the agrmref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRMREF(String value) {
        this.agrmref = value;
    }

}
