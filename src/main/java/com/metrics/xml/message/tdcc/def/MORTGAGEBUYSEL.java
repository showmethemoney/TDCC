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
 *         &lt;element ref="{}BUY"/>
 *         &lt;element ref="{}SELL"/>
 *         &lt;element ref="{}CSH_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BUY_TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SELL_TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TSF_SIDE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="R"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prtyOrCPRTYOrBUY"
})
@XmlRootElement(name = "MORTGAGE_BUYSEL")
public class MORTGAGEBUYSEL {

    public MORTGAGEBUYSEL() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElements({
        @XmlElement(name = "PRTY", type = PRTY.class),
        @XmlElement(name = "CPRTY", type = CPRTY.class),
        @XmlElement(name = "BUY", type = BUY.class),
        @XmlElement(name = "SELL", type = SELL.class),
        @XmlElement(name = "CSH_LEG", type = CSHLEG.class)
    })
    protected List<Object> prtyOrCPRTYOrBUY;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "CNTR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cntrid;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "TRD_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trddt;
    @XmlAttribute(name = "BUY_TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String buytrdrt;
    @XmlAttribute(name = "SELL_TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String selltrdrt;
    @XmlAttribute(name = "TSF_SIDE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tsfside;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;

    /**
     * Gets the value of the prtyOrCPRTYOrBUY property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTYOrBUY property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRTYOrCPRTYOrBUY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRTY }
     * {@link CPRTY }
     * {@link BUY }
     * {@link SELL }
     * {@link CSHLEG }
     * 
     * 
     */
    public List<Object> getPRTYOrCPRTYOrBUY() {
        if (prtyOrCPRTYOrBUY == null) {
            prtyOrCPRTYOrBUY = new ArrayList<Object>();
        }
        return this.prtyOrCPRTYOrBUY;
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
     * Gets the value of the buytrdrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYTRDRT() {
        return buytrdrt;
    }

    /**
     * Sets the value of the buytrdrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYTRDRT(String value) {
        this.buytrdrt = value;
    }

    /**
     * Gets the value of the selltrdrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLTRDRT() {
        return selltrdrt;
    }

    /**
     * Sets the value of the selltrdrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLTRDRT(String value) {
        this.selltrdrt = value;
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

}
