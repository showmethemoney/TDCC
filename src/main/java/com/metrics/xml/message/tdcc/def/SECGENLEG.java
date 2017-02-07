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
 *         &lt;element ref="{}SEC_UNITS_LEG"/>
 *         &lt;element ref="{}FRST_LEG"/>
 *         &lt;element ref="{}SCND_LEG"/>
 *         &lt;element ref="{}BD_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="GEN_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEC_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "SEC_GEN_LEG")
public class SECGENLEG {

    @XmlElements({
        @XmlElement(name = "SEC_UNITS_LEG", type = SECUNITSLEG.class),
        @XmlElement(name = "FRST_LEG", type = FRSTLEG.class),
        @XmlElement(name = "SCND_LEG", type = SCNDLEG.class),
        @XmlElement(name = "BD_LEG", type = BDLEG.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "GEN_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String genid;
    @XmlAttribute(name = "SEC_AMT")
    @XmlSchemaType(name = "anySimpleType")
    protected String secamt;

    /**
     * Gets the value of the secunitslegOrFRSTLEGOrSCNDLEG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secunitslegOrFRSTLEGOrSCNDLEG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECUNITSLEGOrFRSTLEGOrSCNDLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECUNITSLEG }
     * {@link FRSTLEG }
     * {@link SCNDLEG }
     * {@link BDLEG }
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
     * Gets the value of the genid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENID() {
        return genid;
    }

    /**
     * Sets the value of the genid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENID(String value) {
        this.genid = value;
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

}
