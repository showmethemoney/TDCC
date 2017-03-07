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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.metrics.bean.Erinst;
import com.metrics.utils.EmptyObjectUtil;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}STLM_PRTY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FVAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_DAYS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MAT_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BS_PRC" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TAX_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "stlmprty"
})
@XmlRootElement(name = "ER_INST")
public class ERINST {

    public ERINST() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "STLM_PRTY")
    protected List<STLMPRTY> stlmprty;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "FVAL", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fval;
    @XmlAttribute(name = "ISS_DAYS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issdays;
    @XmlAttribute(name = "MAT_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String matdt;
    @XmlAttribute(name = "ISS_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issrt;
    @XmlAttribute(name = "BS_PRC", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String bsprc;
    @XmlAttribute(name = "TAX_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String taxamt;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    
    public ERINST(Erinst erinst) {
    	STLMPRTY stlmPrty = new STLMPRTY( erinst.getStlmprty() );
		if (null != EmptyObjectUtil.isEmptyObject( stlmPrty )) {
			getSTLMPRTY().add( stlmPrty );
		}
		
    	setBSPRC( erinst.getBsprc() );
    	setCSHSYS( erinst.getCshsys() );
    	setFVAL( erinst.getFval() );
    	setISIN( erinst.getIsin() );
    	setISSDAYS( erinst.getIssdays() );
    	setISSRT( erinst.getIssrt() );
    	setMATDT( erinst.getMatdt() );
    	setTAXAMT( erinst.getTaxamt() );
    }
    
    /**
     * Gets the value of the stlmprty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stlmprty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTLMPRTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STLMPRTY }
     * 
     * 
     */
    public List<STLMPRTY> getSTLMPRTY() {
        if (stlmprty == null) {
            stlmprty = new ArrayList<STLMPRTY>();
        }
        return this.stlmprty;
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
     * Gets the value of the fval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVAL() {
        return fval;
    }

    /**
     * Sets the value of the fval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVAL(String value) {
        this.fval = value;
    }

    /**
     * Gets the value of the issdays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSDAYS() {
        return issdays;
    }

    /**
     * Sets the value of the issdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSDAYS(String value) {
        this.issdays = value;
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
     * Gets the value of the issrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSRT() {
        return issrt;
    }

    /**
     * Sets the value of the issrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSRT(String value) {
        this.issrt = value;
    }

    /**
     * Gets the value of the bsprc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSPRC() {
        return bsprc;
    }

    /**
     * Sets the value of the bsprc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSPRC(String value) {
        this.bsprc = value;
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
