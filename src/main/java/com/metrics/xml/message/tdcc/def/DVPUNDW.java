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
 *       &lt;attribute name="SEC_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INV_CSH_ACCT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FT_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DVP_UNDW")
public class DVPUNDW {

    public DVPUNDW() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    @XmlAttribute(name = "SEC_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String secamt;
    @XmlAttribute(name = "CSH_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cshamt;
    @XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String acctid;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "INV_CSH_ACCT")
    @XmlSchemaType(name = "anySimpleType")
    protected String invcshacct;
    @XmlAttribute(name = "FT_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ftref;

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
     * Gets the value of the secamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECAMT() {
        return secamt;
    }

    /**
     * Sets the value of the secamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECAMT(String value) {
        this.secamt = value;
    }

    /**
     * Gets the value of the cshamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSHAMT() {
        return cshamt;
    }

    /**
     * Sets the value of the cshamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSHAMT(String value) {
        this.cshamt = value;
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
     * Gets the value of the invcshacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVCSHACCT() {
        return invcshacct;
    }

    /**
     * Sets the value of the invcshacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVCSHACCT(String value) {
        this.invcshacct = value;
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

}
