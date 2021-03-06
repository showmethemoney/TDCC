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
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BAS_UVAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRI_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRI_MEM" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="V"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INT_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INT_MEM" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PRC_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
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
@XmlType(name = "")
@XmlRootElement(name = "PAY_INFO")
public class PAYINFO {

    public PAYINFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "RDM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmdt;
    @XmlAttribute(name = "BAS_UVAL", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String basuval;
    @XmlAttribute(name = "PRI_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String priamt;
    @XmlAttribute(name = "PRI_MEM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String primem;
    @XmlAttribute(name = "INT_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String intamt;
    @XmlAttribute(name = "INT_MEM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intmem;
    @XmlAttribute(name = "PRC_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prctype;

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
     * Gets the value of the rdmdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDMDT() {
        return rdmdt;
    }

    /**
     * Sets the value of the rdmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDMDT(String value) {
        this.rdmdt = value;
    }

    /**
     * Gets the value of the basuval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASUVAL() {
        return basuval;
    }

    /**
     * Sets the value of the basuval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASUVAL(String value) {
        this.basuval = value;
    }

    /**
     * Gets the value of the priamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIAMT() {
        return priamt;
    }

    /**
     * Sets the value of the priamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIAMT(String value) {
        this.priamt = value;
    }

    /**
     * Gets the value of the primem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMEM() {
        return primem;
    }

    /**
     * Sets the value of the primem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMEM(String value) {
        this.primem = value;
    }

    /**
     * Gets the value of the intamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTAMT() {
        return intamt;
    }

    /**
     * Sets the value of the intamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTAMT(String value) {
        this.intamt = value;
    }

    /**
     * Gets the value of the intmem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTMEM() {
        return intmem;
    }

    /**
     * Sets the value of the intmem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTMEM(String value) {
        this.intmem = value;
    }

    /**
     * Gets the value of the prctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCTYPE() {
        return prctype;
    }

    /**
     * Sets the value of the prctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCTYPE(String value) {
        this.prctype = value;
    }

}
