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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}SEC_LEG"/>
 *         &lt;element ref="{}CSH_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TSF_SIDE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="R"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FT_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNTR_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDMP_TAX_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_SYS">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TWD"/>
 *             &lt;enumeration value="USD"/>
 *             &lt;enumeration value="AUD"/>
 *             &lt;enumeration value="EUR"/>
 *             &lt;enumeration value="JPY"/>
 *             &lt;enumeration value="CNY"/>
 *             &lt;enumeration value="ZAR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HEAL_INSU_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "items"
})
@XmlRootElement(name = "CSH_ADVICE")
public class CSHADVICE {

    @XmlElements({
        @XmlElement(name = "PRTY", type = PRTY.class),
        @XmlElement(name = "CPRTY", type = CPRTY.class),
        @XmlElement(name = "SEC_LEG", type = SECLEG.class),
        @XmlElement(name = "CSH_LEG", type = CSHLEG.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "TSF_SIDE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tsfside;
    @XmlAttribute(name = "FT_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ftref;
    @XmlAttribute(name = "CNTR_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String cntrid;
    @XmlAttribute(name = "BNDL_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String bndlref;
    @XmlAttribute(name = "RDMP_TAX_AMT")
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmptaxamt;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    @XmlAttribute(name = "HEAL_INSU_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String healinsufee;

    /**
     * Gets the value of the prtyOrCPRTYOrSECLEG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTYOrSECLEG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRTYOrCPRTYOrSECLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRTY }
     * {@link CPRTY }
     * {@link SECLEG }
     * {@link CSHLEG }
     * 
     * 
     */
    public List<Object> getItems() {
        if (items == null) {
            items = new ArrayList<Object>();
        }
        return this.items;
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
     * Gets the value of the tsfside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFSIDE() {
        return tsfside;
    }

    /**
     * Sets the value of the tsfside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFSIDE(String value) {
        this.tsfside = value;
    }

    /**
     * Gets the value of the ftref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTREF() {
        return ftref;
    }

    /**
     * Sets the value of the ftref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTREF(String value) {
        this.ftref = value;
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
     * Gets the value of the bndlref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNDLREF() {
        return bndlref;
    }

    /**
     * Sets the value of the bndlref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNDLREF(String value) {
        this.bndlref = value;
    }

    /**
     * Gets the value of the rdmptaxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDMPTAXAMT() {
        return rdmptaxamt;
    }

    /**
     * Sets the value of the rdmptaxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDMPTAXAMT(String value) {
        this.rdmptaxamt = value;
    }

    /**
     * Gets the value of the cshsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSHSYS() {
        return cshsys;
    }

    /**
     * Sets the value of the cshsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSHSYS(String value) {
        this.cshsys = value;
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
