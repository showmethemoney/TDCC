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
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TH_MAT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_BK_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_BK_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_EN_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SWIFT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "REG_INFO")
public class REGINFO {

    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "ISS_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issdt;
    @XmlAttribute(name = "TH_MAT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String thmatdt;
    @XmlAttribute(name = "ISSR_BK_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issrbkid;
    @XmlAttribute(name = "ISSR_ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issracctid;
    @XmlAttribute(name = "ISSR_BK_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrbknm;
    @XmlAttribute(name = "ISSR_EN_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrennm;
    @XmlAttribute(name = "SWIFT")
    @XmlSchemaType(name = "anySimpleType")
    protected String swift;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREF() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREF(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the issdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSDT() {
        return issdt;
    }

    /**
     * Sets the value of the issdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSDT(String value) {
        this.issdt = value;
    }

    /**
     * Gets the value of the thmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHMATDT() {
        return thmatdt;
    }

    /**
     * Sets the value of the thmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHMATDT(String value) {
        this.thmatdt = value;
    }

    /**
     * Gets the value of the issrbkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRBKID() {
        return issrbkid;
    }

    /**
     * Sets the value of the issrbkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRBKID(String value) {
        this.issrbkid = value;
    }

    /**
     * Gets the value of the issracctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRACCTID() {
        return issracctid;
    }

    /**
     * Sets the value of the issracctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRACCTID(String value) {
        this.issracctid = value;
    }

    /**
     * Gets the value of the issrbknm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRBKNM() {
        return issrbknm;
    }

    /**
     * Sets the value of the issrbknm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRBKNM(String value) {
        this.issrbknm = value;
    }

    /**
     * Gets the value of the issrennm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRENNM() {
        return issrennm;
    }

    /**
     * Sets the value of the issrennm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRENNM(String value) {
        this.issrennm = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFT() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFT(String value) {
        this.swift = value;
    }

}