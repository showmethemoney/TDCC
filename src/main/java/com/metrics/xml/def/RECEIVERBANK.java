//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.def;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}CSH_LEG" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNFY_NM" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SWIFT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORG_SNDR_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cshleg"
})
@XmlRootElement(name = "RECEIVER_BANK")
public class RECEIVERBANK {

    @XmlElement(name = "CSH_LEG")
    protected List<CSHLEG> cshleg;
    @XmlAttribute(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "BNFY_NM", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String bnfynm;
    @XmlAttribute(name = "ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String acctid;
    @XmlAttribute(name = "SWIFT")
    @XmlSchemaType(name = "anySimpleType")
    protected String swift;
    @XmlAttribute(name = "ORG_SNDR_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String orgsndrref;

    /**
     * Gets the value of the cshleg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshleg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSHLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSHLEG }
     * 
     * 
     */
    public List<CSHLEG> getCSHLEG() {
        if (cshleg == null) {
            cshleg = new ArrayList<CSHLEG>();
        }
        return this.cshleg;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the bnfynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNFYNM() {
        return bnfynm;
    }

    /**
     * Sets the value of the bnfynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNFYNM(String value) {
        this.bnfynm = value;
    }

    /**
     * Gets the value of the acctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTID() {
        return acctid;
    }

    /**
     * Sets the value of the acctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTID(String value) {
        this.acctid = value;
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

    /**
     * Gets the value of the orgsndrref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGSNDRREF() {
        return orgsndrref;
    }

    /**
     * Sets the value of the orgsndrref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGSNDRREF(String value) {
        this.orgsndrref = value;
    }

}
