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

import com.metrics.bean.RepSec;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}REP_SEC_VAL"/>
 *         &lt;element ref="{}REP_SEC"/>
 *       &lt;/choice>
 *       &lt;attribute name="SEC_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "REP_SEC")
public class REPSEC {

    public REPSEC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElements({
        @XmlElement(name = "REP_SEC_VAL", type = REPSECVAL.class),
        @XmlElement(name = "REP_SEC", type = REPSEC.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "SEC_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String secnm;
    
    public REPSEC(RepSec instance) {
    	REPSECVAL repSecVal = new REPSECVAL( instance.getRepSecVal() );
    	
    	if (null != EmptyObjectUtil.isEmptyObject( repSecVal )) {
    		getItems().add( repSecVal );
    	}
    	//recuisive REPSEC..
    	
    	setSECNM( instance.getSecnm() );
    }
    
    /**
     * Gets the value of the repsecvalOrREPSEC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repsecvalOrREPSEC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREPSECVALOrREPSEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPSECVAL }
     * {@link REPSEC }
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
     * Gets the value of the secnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECNM() {
        return secnm;
    }

    /**
     * Sets the value of the secnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECNM(String value) {
        this.secnm = value;
    }

}
