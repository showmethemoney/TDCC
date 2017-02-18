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
 *         &lt;element ref="{}SEC_LEG"/>
 *         &lt;element ref="{}CSH_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDM_ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REI_ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PSDB_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDM_FACE_VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TAX_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TTL_RDMP_VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="UND_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNS_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GUT_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seclegOrCSHLEG"
})
@XmlRootElement(name = "REI_NOTE")
public class REINOTE {

    public REINOTE() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElements({
        @XmlElement(name = "SEC_LEG", type = SECLEG.class),
        @XmlElement(name = "CSH_LEG", type = CSHLEG.class)
    })
    protected List<Object> seclegOrCSHLEG;
    @XmlAttribute(name = "REF", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "RDM_ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmisin;
    @XmlAttribute(name = "REI_ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reiisin;
    @XmlAttribute(name = "PSDB_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String psdbid;
    @XmlAttribute(name = "RDM_FACE_VAL", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmfaceval;
    @XmlAttribute(name = "TAX_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String taxamt;
    @XmlAttribute(name = "TTL_RDMP_VAL", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ttlrdmpval;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    @XmlAttribute(name = "UND_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String undfee;
    @XmlAttribute(name = "CNS_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cnsfee;
    @XmlAttribute(name = "GUT_FEE")
    @XmlSchemaType(name = "anySimpleType")
    protected String gutfee;

    /**
     * Gets the value of the seclegOrCSHLEG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seclegOrCSHLEG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECLEGOrCSHLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECLEG }
     * {@link CSHLEG }
     * 
     * 
     */
    public List<Object> getSECLEGOrCSHLEG() {
        if (seclegOrCSHLEG == null) {
            seclegOrCSHLEG = new ArrayList<Object>();
        }
        return this.seclegOrCSHLEG;
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
     * Gets the value of the rdmisin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDMISIN() {
        return rdmisin;
    }

    /**
     * Sets the value of the rdmisin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDMISIN(String value) {
        this.rdmisin = value;
    }

    /**
     * Gets the value of the reiisin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREIISIN() {
        return reiisin;
    }

    /**
     * Sets the value of the reiisin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREIISIN(String value) {
        this.reiisin = value;
    }

    /**
     * Gets the value of the psdbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSDBID() {
        return psdbid;
    }

    /**
     * Sets the value of the psdbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSDBID(String value) {
        this.psdbid = value;
    }

    /**
     * Gets the value of the rdmfaceval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDMFACEVAL() {
        return rdmfaceval;
    }

    /**
     * Sets the value of the rdmfaceval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDMFACEVAL(String value) {
        this.rdmfaceval = value;
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
     * Gets the value of the ttlrdmpval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTLRDMPVAL() {
        return ttlrdmpval;
    }

    /**
     * Sets the value of the ttlrdmpval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTLRDMPVAL(String value) {
        this.ttlrdmpval = value;
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
     * Gets the value of the undfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDFEE() {
        return undfee;
    }

    /**
     * Sets the value of the undfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDFEE(String value) {
        this.undfee = value;
    }

    /**
     * Gets the value of the cnsfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNSFEE() {
        return cnsfee;
    }

    /**
     * Sets the value of the cnsfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNSFEE(String value) {
        this.cnsfee = value;
    }

    /**
     * Gets the value of the gutfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUTFEE() {
        return gutfee;
    }

    /**
     * Sets the value of the gutfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUTFEE(String value) {
        this.gutfee = value;
    }

}
