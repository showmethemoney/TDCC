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

import com.metrics.bean.SecBlk;


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
 *         &lt;element ref="{}STLM_PRTY"/>
 *         &lt;element ref="{}SEC_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RSN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "SEC_BLK")
public class SECBLK {

    @XmlElements({
        @XmlElement(name = "STLM_PRTY", type = STLMPRTY.class),
        @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "STLM_DT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stlmdt;
    @XmlAttribute(name = "RSN")
    @XmlSchemaType(name = "anySimpleType")
    protected String rsn;
    
    public SECBLK(SecBlk secBlk) {
		// @XmlElement(name = "STLM_PRTY", type = STLMPRTY.class),
		// @XmlElement(name = "SEC_LEG", type = SECLEG.class)
    	getItems().add( new STLMPRTY( secBlk.getStlmPrty() ) );
    	SECLEG secLeg = new SECLEG( null, secBlk.getSecLeg().getIsin(), secBlk.getSecLeg().getMgcntrid() );

		// @XmlElement(name = "SEC_UNITS_LEG", type = SECUNITSLEG.class),
		// @XmlElement(name = "FRST_LEG", type = FRSTLEG.class),
		// @XmlElement(name = "SCND_LEG", type = SCNDLEG.class),
		// @XmlElement(name = "BD_LEG", type = BDLEG.class)
		SECGENLEG secGenLeg = new SECGENLEG( null, secBlk.getSecLeg().getSecGenLeg().getGenid(), secBlk.getSecLeg().getSecGenLeg().getSecamt() );
		secGenLeg.getItems().add( new SECUNITSLEG( secBlk.getSecLeg().getSecGenLeg().getSecUnitsLeg() ) );

		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
		// @XmlElement(name = "TAX_IMP", type = TAXIMP.class)
		FRSTLEG frstLeg = new FRSTLEG();
		frstLeg.getItems().add( new CSHLEG( secBlk.getSecLeg().getSecGenLeg().getFrstLeg().getCshLeg() ) );
		frstLeg.getItems().add( new TAXIMP( secBlk.getSecLeg().getSecGenLeg().getFrstLeg().getTaxImp() ) );
		secGenLeg.getItems().add( frstLeg );

		secGenLeg.getItems().add( new BDLEG( secBlk.getSecLeg().getSecGenLeg().getBdLeg() ) );

		secLeg.getItems().add( secGenLeg );

		getItems().add( secLeg );
		
		setRSN( secBlk.getRsn() );
		setSTLMDT( secBlk.getStlmdt() );
    }
    
    /**
     * Gets the value of the stlmprtyOrSECLEG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stlmprtyOrSECLEG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTLMPRTYOrSECLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STLMPRTY }
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
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSN() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSN(String value) {
        this.rsn = value;
    }

}
