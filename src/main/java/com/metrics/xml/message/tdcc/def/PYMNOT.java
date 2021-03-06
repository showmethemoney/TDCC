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
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INV_CSH_ACCT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="7"/>
 *             &lt;enumeration value="8"/>
 *             &lt;enumeration value="9"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="12"/>
 *             &lt;enumeration value="13"/>
 *             &lt;enumeration value="14"/>
 *             &lt;enumeration value="15"/>
 *             &lt;enumeration value="31"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ORG_SEC_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEC_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_CCY">
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
 *       &lt;attribute name="FT_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SWIFT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TAL_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_ST" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PRI" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BK_PRI" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CA_PRI" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TAX_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HEAL_INSU_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RCR_NAT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRANS_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PYM_NOT")
public class PYMNOT {

    public PYMNOT() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "ACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String acctid;
    @XmlAttribute(name = "INV_CSH_ACCT")
    @XmlSchemaType(name = "anySimpleType")
    protected String invcshacct;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "ISS_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isstype;
    @XmlAttribute(name = "ORG_SEC_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String orgsecamt;
    @XmlAttribute(name = "SEC_AMT")
    @XmlSchemaType(name = "anySimpleType")
    protected String secamt;
    @XmlAttribute(name = "CSH_CCY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshccy;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    @XmlAttribute(name = "FT_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ftref;
    @XmlAttribute(name = "SWIFT")
    @XmlSchemaType(name = "anySimpleType")
    protected String swift;
    @XmlAttribute(name = "TAL_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String talamt;
    @XmlAttribute(name = "PAY_ST", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String payst;
    @XmlAttribute(name = "PRI", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String pri;
    @XmlAttribute(name = "BK_PRI", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String bkpri;
    @XmlAttribute(name = "CA_PRI", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String capri;
    @XmlAttribute(name = "INT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String _int;
    @XmlAttribute(name = "TAX_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String taxamt;
    @XmlAttribute(name = "HEAL_INSU_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String healinsufee;
    @XmlAttribute(name = "RCR_NAT")
    @XmlSchemaType(name = "anySimpleType")
    protected String rcrnat;
    @XmlAttribute(name = "TRANS_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String transfee;

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
     * Gets the value of the isstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTYPE() {
        return isstype;
    }

    /**
     * Sets the value of the isstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTYPE(String value) {
        this.isstype = value;
    }

    /**
     * Gets the value of the orgsecamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGSECAMT() {
        return orgsecamt;
    }

    /**
     * Sets the value of the orgsecamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGSECAMT(String value) {
        this.orgsecamt = value;
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
     * Gets the value of the cshccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSHCCY() {
        return cshccy;
    }

    /**
     * Sets the value of the cshccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSHCCY(String value) {
        this.cshccy = value;
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
     * Gets the value of the talamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTALAMT() {
        return talamt;
    }

    /**
     * Sets the value of the talamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTALAMT(String value) {
        this.talamt = value;
    }

    /**
     * Gets the value of the payst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYST() {
        return payst;
    }

    /**
     * Sets the value of the payst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYST(String value) {
        this.payst = value;
    }

    /**
     * Gets the value of the pri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRI() {
        return pri;
    }

    /**
     * Sets the value of the pri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRI(String value) {
        this.pri = value;
    }

    /**
     * Gets the value of the bkpri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKPRI() {
        return bkpri;
    }

    /**
     * Sets the value of the bkpri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKPRI(String value) {
        this.bkpri = value;
    }

    /**
     * Gets the value of the capri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPRI() {
        return capri;
    }

    /**
     * Sets the value of the capri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPRI(String value) {
        this.capri = value;
    }

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT(String value) {
        this._int = value;
    }

    /**
     * Gets the value of the taxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXAMT() {
        return taxamt;
    }

    /**
     * Sets the value of the taxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXAMT(String value) {
        this.taxamt = value;
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

    /**
     * Gets the value of the rcrnat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCRNAT() {
        return rcrnat;
    }

    /**
     * Sets the value of the rcrnat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCRNAT(String value) {
        this.rcrnat = value;
    }

    /**
     * Gets the value of the transfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFEE() {
        return transfee;
    }

    /**
     * Sets the value of the transfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFEE(String value) {
        this.transfee = value;
    }

}
