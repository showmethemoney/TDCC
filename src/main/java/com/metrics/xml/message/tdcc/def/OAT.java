//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.message.tdcc.def;

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
 *         &lt;element ref="{}SEC_LEG" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DB_ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CR_ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secleg"
})
@XmlRootElement(name = "OAT")
public class OAT {

    public OAT() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "SEC_LEG")
    protected List<SECLEG> secleg;
    @XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "DB_ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dbacctid;
    @XmlAttribute(name = "CR_ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cracctid;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;

    /**
     * Gets the value of the secleg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secleg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECLEG }
     * 
     * 
     */
    public List<SECLEG> getSECLEG() {
        if (secleg == null) {
            secleg = new ArrayList<SECLEG>();
        }
        return this.secleg;
    }

    /**
     * Gets the value of the prtyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRTYID() {
        return prtyid;
    }

    /**
     * Sets the value of the prtyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRTYID(String value) {
        this.prtyid = value;
    }

    /**
     * Gets the value of the dbacctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBACCTID() {
        return dbacctid;
    }

    /**
     * Sets the value of the dbacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBACCTID(String value) {
        this.dbacctid = value;
    }

    /**
     * Gets the value of the cracctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRACCTID() {
        return cracctid;
    }

    /**
     * Sets the value of the cracctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRACCTID(String value) {
        this.cracctid = value;
    }

    /**
     * Gets the value of the stlmdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTLMDT() {
        return stlmdt;
    }

    /**
     * Sets the value of the stlmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTLMDT(String value) {
        this.stlmdt = value;
    }

}
