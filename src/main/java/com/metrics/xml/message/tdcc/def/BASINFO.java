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
 *       &lt;attribute name="ISIN_NM" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PSTB_ISS_TYPE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_TYPE">
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
 *       &lt;attribute name="SEC_CCY">
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
 *       &lt;attribute name="ISS_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TH_MAT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_MODE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ISS_MARK" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DIV_MARK" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RT_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ISSUE_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NB_FQ" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="UVAL01" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL02" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL03" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL04" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL05" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL06" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL07" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL08" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL09" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UVAL10" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_UVAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_ORG" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_BNK_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_ACCT_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAY_ACCT_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_PAY_ACCT_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_BK_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_ACCT_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_BK_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_CT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORG_ISIN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REG_ORG">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ISS_NAT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DVP_MARK">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INTB_CODE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VER_TYPE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BAS_INFO")
public class BASINFO {

    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "ISIN_NM", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isinnm;
    @XmlAttribute(name = "PSTB_ISS_TYPE")
    @XmlSchemaType(name = "anySimpleType")
    protected String pstbisstype;
    @XmlAttribute(name = "ISS_TYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isstype;
    @XmlAttribute(name = "SEC_CCY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String secccy;
    @XmlAttribute(name = "ISS_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issdt;
    @XmlAttribute(name = "TH_MAT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String thmatdt;
    @XmlAttribute(name = "ISS_MODE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issmode;
    @XmlAttribute(name = "ISS_MARK", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issmark;
    @XmlAttribute(name = "DIV_MARK", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String divmark;
    @XmlAttribute(name = "RT_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rttype;
    @XmlAttribute(name = "ISSUE_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issuert;
    @XmlAttribute(name = "NB_FQ", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String nbfq;
    @XmlAttribute(name = "PAY_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paytype;
    @XmlAttribute(name = "UVAL01", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String uval01;
    @XmlAttribute(name = "UVAL02")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval02;
    @XmlAttribute(name = "UVAL03")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval03;
    @XmlAttribute(name = "UVAL04")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval04;
    @XmlAttribute(name = "UVAL05")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval05;
    @XmlAttribute(name = "UVAL06")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval06;
    @XmlAttribute(name = "UVAL07")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval07;
    @XmlAttribute(name = "UVAL08")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval08;
    @XmlAttribute(name = "UVAL09")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval09;
    @XmlAttribute(name = "UVAL10")
    @XmlSchemaType(name = "anySimpleType")
    protected String uval10;
    @XmlAttribute(name = "PAY_UVAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String payuval;
    @XmlAttribute(name = "PAY_ORG", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String payorg;
    @XmlAttribute(name = "PAY_BNK_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String paybnkid;
    @XmlAttribute(name = "PAY_ACCT_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String payacctid;
    @XmlAttribute(name = "PAY_ACCT_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String payacctnm;
    @XmlAttribute(name = "ISSR_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrid;
    @XmlAttribute(name = "ISSR_PAY_ACCT_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrpayacctid;
    @XmlAttribute(name = "ISSR_BK_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrbkid;
    @XmlAttribute(name = "ISSR_ACCT_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String issracctid;
    @XmlAttribute(name = "ISSR_BK_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrbknm;
    @XmlAttribute(name = "ISSR_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrnm;
    @XmlAttribute(name = "ISSR_CT_TYPE")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrcttype;
    @XmlAttribute(name = "ORG_ISIN")
    @XmlSchemaType(name = "anySimpleType")
    protected String orgisin;
    @XmlAttribute(name = "REG_ORG")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String regorg;
    @XmlAttribute(name = "ISS_NAT")
    @XmlSchemaType(name = "anySimpleType")
    protected String issnat;
    @XmlAttribute(name = "DVP_MARK")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dvpmark;
    @XmlAttribute(name = "INTB_CODE")
    @XmlSchemaType(name = "anySimpleType")
    protected String intbcode;
    @XmlAttribute(name = "VER_TYPE")
    @XmlSchemaType(name = "anySimpleType")
    protected String vertype;

    public BASINFO() {
		super();
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
     * Gets the value of the isinnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISINNM() {
        return isinnm;
    }

    /**
     * Sets the value of the isinnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISINNM(String value) {
        this.isinnm = value;
    }

    /**
     * Gets the value of the pstbisstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTBISSTYPE() {
        return pstbisstype;
    }

    /**
     * Sets the value of the pstbisstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTBISSTYPE(String value) {
        this.pstbisstype = value;
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
     * Gets the value of the secccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECCCY() {
        return secccy;
    }

    /**
     * Sets the value of the secccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECCCY(String value) {
        this.secccy = value;
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
     * Gets the value of the issmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSMODE() {
        return issmode;
    }

    /**
     * Sets the value of the issmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSMODE(String value) {
        this.issmode = value;
    }

    /**
     * Gets the value of the issmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSMARK() {
        return issmark;
    }

    /**
     * Sets the value of the issmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSMARK(String value) {
        this.issmark = value;
    }

    /**
     * Gets the value of the divmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVMARK() {
        return divmark;
    }

    /**
     * Sets the value of the divmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVMARK(String value) {
        this.divmark = value;
    }

    /**
     * Gets the value of the rttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTTYPE() {
        return rttype;
    }

    /**
     * Sets the value of the rttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTTYPE(String value) {
        this.rttype = value;
    }

    /**
     * Gets the value of the issuert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUERT() {
        return issuert;
    }

    /**
     * Sets the value of the issuert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUERT(String value) {
        this.issuert = value;
    }

    /**
     * Gets the value of the nbfq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBFQ() {
        return nbfq;
    }

    /**
     * Sets the value of the nbfq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBFQ(String value) {
        this.nbfq = value;
    }

    /**
     * Gets the value of the paytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYTYPE() {
        return paytype;
    }

    /**
     * Sets the value of the paytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYTYPE(String value) {
        this.paytype = value;
    }

    /**
     * Gets the value of the uval01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL01() {
        return uval01;
    }

    /**
     * Sets the value of the uval01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL01(String value) {
        this.uval01 = value;
    }

    /**
     * Gets the value of the uval02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL02() {
        return uval02;
    }

    /**
     * Sets the value of the uval02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL02(String value) {
        this.uval02 = value;
    }

    /**
     * Gets the value of the uval03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL03() {
        return uval03;
    }

    /**
     * Sets the value of the uval03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL03(String value) {
        this.uval03 = value;
    }

    /**
     * Gets the value of the uval04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL04() {
        return uval04;
    }

    /**
     * Sets the value of the uval04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL04(String value) {
        this.uval04 = value;
    }

    /**
     * Gets the value of the uval05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL05() {
        return uval05;
    }

    /**
     * Sets the value of the uval05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL05(String value) {
        this.uval05 = value;
    }

    /**
     * Gets the value of the uval06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL06() {
        return uval06;
    }

    /**
     * Sets the value of the uval06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL06(String value) {
        this.uval06 = value;
    }

    /**
     * Gets the value of the uval07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL07() {
        return uval07;
    }

    /**
     * Sets the value of the uval07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL07(String value) {
        this.uval07 = value;
    }

    /**
     * Gets the value of the uval08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL08() {
        return uval08;
    }

    /**
     * Sets the value of the uval08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL08(String value) {
        this.uval08 = value;
    }

    /**
     * Gets the value of the uval09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL09() {
        return uval09;
    }

    /**
     * Sets the value of the uval09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL09(String value) {
        this.uval09 = value;
    }

    /**
     * Gets the value of the uval10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVAL10() {
        return uval10;
    }

    /**
     * Sets the value of the uval10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVAL10(String value) {
        this.uval10 = value;
    }

    /**
     * Gets the value of the payuval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYUVAL() {
        return payuval;
    }

    /**
     * Sets the value of the payuval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYUVAL(String value) {
        this.payuval = value;
    }

    /**
     * Gets the value of the payorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYORG() {
        return payorg;
    }

    /**
     * Sets the value of the payorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYORG(String value) {
        this.payorg = value;
    }

    /**
     * Gets the value of the paybnkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYBNKID() {
        return paybnkid;
    }

    /**
     * Sets the value of the paybnkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYBNKID(String value) {
        this.paybnkid = value;
    }

    /**
     * Gets the value of the payacctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYACCTID() {
        return payacctid;
    }

    /**
     * Sets the value of the payacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYACCTID(String value) {
        this.payacctid = value;
    }

    /**
     * Gets the value of the payacctnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYACCTNM() {
        return payacctnm;
    }

    /**
     * Sets the value of the payacctnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYACCTNM(String value) {
        this.payacctnm = value;
    }

    /**
     * Gets the value of the issrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRID() {
        return issrid;
    }

    /**
     * Sets the value of the issrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRID(String value) {
        this.issrid = value;
    }

    /**
     * Gets the value of the issrpayacctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRPAYACCTID() {
        return issrpayacctid;
    }

    /**
     * Sets the value of the issrpayacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRPAYACCTID(String value) {
        this.issrpayacctid = value;
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
     * Gets the value of the issrnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRNM() {
        return issrnm;
    }

    /**
     * Sets the value of the issrnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRNM(String value) {
        this.issrnm = value;
    }

    /**
     * Gets the value of the issrcttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRCTTYPE() {
        return issrcttype;
    }

    /**
     * Sets the value of the issrcttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRCTTYPE(String value) {
        this.issrcttype = value;
    }

    /**
     * Gets the value of the orgisin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGISIN() {
        return orgisin;
    }

    /**
     * Sets the value of the orgisin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGISIN(String value) {
        this.orgisin = value;
    }

    /**
     * Gets the value of the regorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGORG() {
        return regorg;
    }

    /**
     * Sets the value of the regorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGORG(String value) {
        this.regorg = value;
    }

    /**
     * Gets the value of the issnat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSNAT() {
        return issnat;
    }

    /**
     * Sets the value of the issnat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSNAT(String value) {
        this.issnat = value;
    }

    /**
     * Gets the value of the dvpmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVPMARK() {
        return dvpmark;
    }

    /**
     * Sets the value of the dvpmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVPMARK(String value) {
        this.dvpmark = value;
    }

    /**
     * Gets the value of the intbcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTBCODE() {
        return intbcode;
    }

    /**
     * Sets the value of the intbcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTBCODE(String value) {
        this.intbcode = value;
    }

    /**
     * Gets the value of the vertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERTYPE() {
        return vertype;
    }

    /**
     * Sets the value of the vertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERTYPE(String value) {
        this.vertype = value;
    }

}
