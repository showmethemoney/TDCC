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
 *         &lt;element ref="{}PCH"/>
 *         &lt;element ref="{}RPCH"/>
 *         &lt;element ref="{}SEC_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TSF_SIDE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="R"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="REPO_CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RM_CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "prtyOrCPRTYOrPCH"
})
@XmlRootElement(name = "RM_EXCHANGE")
public class RMEXCHANGE {

    public RMEXCHANGE() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElements({
        @XmlElement(name = "PRTY", type = PRTY.class),
        @XmlElement(name = "CPRTY", type = CPRTY.class),
        @XmlElement(name = "PCH", type = PCH.class),
        @XmlElement(name = "RPCH", type = RPCH.class),
        @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    })
    protected List<Object> prtyOrCPRTYOrPCH;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "CSH_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cshamt;
    @XmlAttribute(name = "TRD_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trddt;
    @XmlAttribute(name = "TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trdrt;
    @XmlAttribute(name = "TSF_SIDE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tsfside;
    @XmlAttribute(name = "REPO_CNTR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String repocntrid;
    @XmlAttribute(name = "RM_CNTR_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rmcntrid;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;

    /**
     * Gets the value of the prtyOrCPRTYOrPCH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTYOrPCH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRTYOrCPRTYOrPCH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRTY }
     * {@link CPRTY }
     * {@link PCH }
     * {@link RPCH }
     * {@link SECLEG }
     * 
     * 
     */
    public List<Object> getPRTYOrCPRTYOrPCH() {
        if (prtyOrCPRTYOrPCH == null) {
            prtyOrCPRTYOrPCH = new ArrayList<Object>();
        }
        return this.prtyOrCPRTYOrPCH;
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
     * Gets the value of the repocntrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPOCNTRID() {
        return repocntrid;
    }

    /**
     * Sets the value of the repocntrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPOCNTRID(String value) {
        this.repocntrid = value;
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
