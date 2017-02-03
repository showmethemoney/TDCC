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
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}CSH_LEG"/>
 *         &lt;element ref="{}SEC_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CPRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RPCH_STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cshlegOrSECLEG"
})
@XmlRootElement(name = "MOD_REPO")
public class MODREPO {

    @XmlElements({
        @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
        @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    })
    protected List<Object> cshlegOrSECLEG;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "CPRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cprtyid;
    @XmlAttribute(name = "CNTR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cntrid;
    @XmlAttribute(name = "TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trdrt;
    @XmlAttribute(name = "RPCH_STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rpchstlmdt;

    /**
     * Gets the value of the cshlegOrSECLEG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshlegOrSECLEG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSHLEGOrSECLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSHLEG }
     * {@link SECLEG }
     * 
     * 
     */
    public List<Object> getCSHLEGOrSECLEG() {
        if (cshlegOrSECLEG == null) {
            cshlegOrSECLEG = new ArrayList<Object>();
        }
        return this.cshlegOrSECLEG;
    }

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
     * Gets the value of the cprtyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRTYID() {
        return cprtyid;
    }

    /**
     * Sets the value of the cprtyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPRTYID(String value) {
        this.cprtyid = value;
    }

    /**
     * Gets the value of the cntrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTRID() {
        return cntrid;
    }

    /**
     * Sets the value of the cntrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTRID(String value) {
        this.cntrid = value;
    }

    /**
     * Gets the value of the trdrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDRT() {
        return trdrt;
    }

    /**
     * Sets the value of the trdrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDRT(String value) {
        this.trdrt = value;
    }

    /**
     * Gets the value of the rpchstlmdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPCHSTLMDT() {
        return rpchstlmdt;
    }

    /**
     * Sets the value of the rpchstlmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPCHSTLMDT(String value) {
        this.rpchstlmdt = value;
    }

}
