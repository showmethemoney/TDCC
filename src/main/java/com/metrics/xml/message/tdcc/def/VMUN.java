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
 *       &lt;attribute name="BD_SNDR_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INVS_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CB_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CPRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CACCT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORG_REF" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRG_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRG_NM" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSR_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AGR_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISINGEN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TH_MAT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MAT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RPCH_STLM_DT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CRT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEC_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DU_CSH_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DEAL_SIDE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DEAL_TYPE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CLAS_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PRICE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCR_DAY" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCR_INT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACCR_TAX" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEC_CCY" use="required">
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
@XmlType(name = "")
@XmlRootElement(name = "VMUN")
public class VMUN {

    @XmlAttribute(name = "BD_SNDR_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String bdsndrref;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "INVS_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String invsid;
    @XmlAttribute(name = "CB_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cbid;
    @XmlAttribute(name = "CPRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cprtyid;
    @XmlAttribute(name = "CACCT_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cacctid;
    @XmlAttribute(name = "ORG_REF", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String orgref;
    @XmlAttribute(name = "BNDL_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String bndlref;
    @XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "TRD_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trddt;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "TRD_TYPE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trdtype;
    @XmlAttribute(name = "TRG_TYPE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trgtype;
    @XmlAttribute(name = "TRG_NM", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trgnm;
    @XmlAttribute(name = "ISSR_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String issrnm;
    @XmlAttribute(name = "AGR_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String agrid;
    @XmlAttribute(name = "ISINGEN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isingen;
    @XmlAttribute(name = "ISS_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issdt;
    @XmlAttribute(name = "TH_MAT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String thmatdt;
    @XmlAttribute(name = "MAT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String matdt;
    @XmlAttribute(name = "TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trdrt;
    @XmlAttribute(name = "RPCH_STLM_DT")
    @XmlSchemaType(name = "anySimpleType")
    protected String rpchstlmdt;
    @XmlAttribute(name = "CRT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String crtdt;
    @XmlAttribute(name = "SEC_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String secamt;
    @XmlAttribute(name = "TRD_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trdamt;
    @XmlAttribute(name = "DU_CSH_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ducshamt;
    @XmlAttribute(name = "DEAL_SIDE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dealside;
    @XmlAttribute(name = "DEAL_TYPE")
    @XmlSchemaType(name = "anySimpleType")
    protected String dealtype;
    @XmlAttribute(name = "CLAS_TYPE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clastype;
    @XmlAttribute(name = "PRICE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String price;
    @XmlAttribute(name = "ACCR_DAY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String accrday;
    @XmlAttribute(name = "ACCR_INT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String accrint;
    @XmlAttribute(name = "ACCR_TAX", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String accrtax;
    @XmlAttribute(name = "SEC_CCY", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String secccy;

    /**
     * Gets the value of the bdsndrref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDSNDRREF() {
        return bdsndrref;
    }

    /**
     * Sets the value of the bdsndrref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDSNDRREF(String value) {
        this.bdsndrref = value;
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
     * Gets the value of the invsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSID() {
        return invsid;
    }

    /**
     * Sets the value of the invsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSID(String value) {
        this.invsid = value;
    }

    /**
     * Gets the value of the cbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBID() {
        return cbid;
    }

    /**
     * Sets the value of the cbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBID(String value) {
        this.cbid = value;
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
     * Gets the value of the cacctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCACCTID() {
        return cacctid;
    }

    /**
     * Sets the value of the cacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCACCTID(String value) {
        this.cacctid = value;
    }

    /**
     * Gets the value of the orgref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGREF() {
        return orgref;
    }

    /**
     * Sets the value of the orgref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGREF(String value) {
        this.orgref = value;
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
     * Gets the value of the trdtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDTYPE() {
        return trdtype;
    }

    /**
     * Sets the value of the trdtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDTYPE(String value) {
        this.trdtype = value;
    }

    /**
     * Gets the value of the trgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRGTYPE() {
        return trgtype;
    }

    /**
     * Sets the value of the trgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRGTYPE(String value) {
        this.trgtype = value;
    }

    /**
     * Gets the value of the trgnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRGNM() {
        return trgnm;
    }

    /**
     * Sets the value of the trgnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRGNM(String value) {
        this.trgnm = value;
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
     * Gets the value of the agrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRID() {
        return agrid;
    }

    /**
     * Sets the value of the agrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRID(String value) {
        this.agrid = value;
    }

    /**
     * Gets the value of the isingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISINGEN() {
        return isingen;
    }

    /**
     * Sets the value of the isingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISINGEN(String value) {
        this.isingen = value;
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
     * Gets the value of the matdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATDT() {
        return matdt;
    }

    /**
     * Sets the value of the matdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATDT(String value) {
        this.matdt = value;
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

    /**
     * Gets the value of the crtdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTDT() {
        return crtdt;
    }

    /**
     * Sets the value of the crtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTDT(String value) {
        this.crtdt = value;
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
     * Gets the value of the trdamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDAMT() {
        return trdamt;
    }

    /**
     * Sets the value of the trdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDAMT(String value) {
        this.trdamt = value;
    }

    /**
     * Gets the value of the ducshamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUCSHAMT() {
        return ducshamt;
    }

    /**
     * Sets the value of the ducshamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUCSHAMT(String value) {
        this.ducshamt = value;
    }

    /**
     * Gets the value of the dealside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALSIDE() {
        return dealside;
    }

    /**
     * Sets the value of the dealside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALSIDE(String value) {
        this.dealside = value;
    }

    /**
     * Gets the value of the dealtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALTYPE() {
        return dealtype;
    }

    /**
     * Sets the value of the dealtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALTYPE(String value) {
        this.dealtype = value;
    }

    /**
     * Gets the value of the clastype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASTYPE() {
        return clastype;
    }

    /**
     * Sets the value of the clastype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASTYPE(String value) {
        this.clastype = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the accrday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCRDAY() {
        return accrday;
    }

    /**
     * Sets the value of the accrday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCRDAY(String value) {
        this.accrday = value;
    }

    /**
     * Gets the value of the accrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCRINT() {
        return accrint;
    }

    /**
     * Sets the value of the accrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCRINT(String value) {
        this.accrint = value;
    }

    /**
     * Gets the value of the accrtax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCRTAX() {
        return accrtax;
    }

    /**
     * Sets the value of the accrtax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCRTAX(String value) {
        this.accrtax = value;
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

}