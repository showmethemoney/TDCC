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

import com.metrics.bean.MortgageRegex;


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
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNTR_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DEAL_SIDE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="R"/>
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
    "items"
})
@XmlRootElement(name = "MORTGAGE_REGEX")
public class MORTGAGEREGEX {

    @XmlElements({
        @XmlElement(name = "PRTY", type = PRTY.class),
        @XmlElement(name = "CPRTY", type = CPRTY.class),
        @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "CNTR_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String cntrid;
    @XmlAttribute(name = "DEAL_SIDE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dealside;
    
    public MORTGAGEREGEX(MortgageRegex mortgageRegex) {
		// @XmlElement(name = "PRTY", type = PRTY.class),
		// @XmlElement(name = "CPRTY", type = CPRTY.class),
		// @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    	getItems().add( new PRTY().getSTLMPRTY().add( new STLMPRTY( mortgageRegex.getPrty().getStlmprty() ) ) );
    	getItems().add( new CPRTY().getSTLMPRTY().add( new STLMPRTY( mortgageRegex.getCprty().getStlmprty() ) ) );
    	
    	SECLEG secLeg = new SECLEG( null, mortgageRegex.getSecLeg().getIsin(), mortgageRegex.getSecLeg().getMgcntrid() );

		// @XmlElement(name = "SEC_UNITS_LEG", type = SECUNITSLEG.class),
		// @XmlElement(name = "FRST_LEG", type = FRSTLEG.class),
		// @XmlElement(name = "SCND_LEG", type = SCNDLEG.class),
		// @XmlElement(name = "BD_LEG", type = BDLEG.class)
		SECGENLEG secGenLeg = new SECGENLEG( null, mortgageRegex.getSecLeg().getSecGenLeg().getGenid(), mortgageRegex.getSecLeg().getSecGenLeg().getSecamt() );
		secGenLeg.getItems().add( new SECUNITSLEG( mortgageRegex.getSecLeg().getSecGenLeg().getSecUnitsLeg() ) );

		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
		// @XmlElement(name = "TAX_IMP", type = TAXIMP.class)
		FRSTLEG frstLeg = new FRSTLEG();
		frstLeg.getItems().add( new CSHLEG( mortgageRegex.getSecLeg().getSecGenLeg().getFrstLeg().getCshLeg() ) );
		frstLeg.getItems().add( new TAXIMP( mortgageRegex.getSecLeg().getSecGenLeg().getFrstLeg().getTaxImp() ) );
		secGenLeg.getItems().add( frstLeg );

		secGenLeg.getItems().add( new BDLEG( mortgageRegex.getSecLeg().getSecGenLeg().getBdLeg() ) );

		secLeg.getItems().add( secGenLeg );

		getItems().add( secLeg );
		
		setCNTRID( mortgageRegex.getCntrid() );
		setDEALSIDE( mortgageRegex.getDealside() );
		setREF( mortgageRegex.getRef() );
		setSTLMDT( mortgageRegex.getStlmdt() );
    }
    
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

}
