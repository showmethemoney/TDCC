//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.05 at 07:26:03 PM CST 
//


package com.metrics.xml.message.opc.def;

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
 *       &lt;attribute name="KEY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NEW_KEY" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RANDOM_NO" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CHG_KEY")
public class CHGKEY {

    @XmlAttribute(name = "KEY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String keyid;
    @XmlAttribute(name = "NEW_KEY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String newkey;
    @XmlAttribute(name = "RANDOM_NO", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String randomno;

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the newkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWKEY() {
        return newkey;
    }

    /**
     * Sets the value of the newkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWKEY(String value) {
        this.newkey = value;
    }

    /**
     * Gets the value of the randomno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRANDOMNO() {
        return randomno;
    }

    /**
     * Sets the value of the randomno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRANDOMNO(String value) {
        this.randomno = value;
    }

}
