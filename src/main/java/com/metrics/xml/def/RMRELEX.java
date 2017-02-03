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
 *         &lt;element ref="{}PRTY"/>
 *         &lt;element ref="{}CPRTY"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RM_CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prtyOrCPRTY"
})
@XmlRootElement(name = "RM_RELEX")
public class RMRELEX {

    @XmlElements({
        @XmlElement(name = "PRTY", type = PRTY.class),
        @XmlElement(name = "CPRTY", type = CPRTY.class)
    })
    protected List<Object> prtyOrCPRTY;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "TRD_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trddt;
    @XmlAttribute(name = "RM_CNTR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rmcntrid;

    /**
     * Gets the value of the prtyOrCPRTY property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTY property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRTYOrCPRTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRTY }
     * {@link CPRTY }
     * 
     * 
     */
    public List<Object> getPRTYOrCPRTY() {
        if (prtyOrCPRTY == null) {
            prtyOrCPRTY = new ArrayList<Object>();
        }
        return this.prtyOrCPRTY;
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

    /**
     * Gets the value of the trddt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDDT() {
        return trddt;
    }

    /**
     * Sets the value of the trddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDDT(String value) {
        this.trddt = value;
    }

    /**
     * Gets the value of the rmcntrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMCNTRID() {
        return rmcntrid;
    }

    /**
     * Sets the value of the rmcntrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMCNTRID(String value) {
        this.rmcntrid = value;
    }

}
