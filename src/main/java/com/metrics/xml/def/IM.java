//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.def;

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
 *         &lt;element ref="{}SNDR"/>
 *         &lt;element ref="{}RCVR"/>
 *       &lt;/choice>
 *       &lt;attribute name="MSG" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sndrOrRCVR"
})
@XmlRootElement(name = "IM")
public class IM {

    @XmlElements({
        @XmlElement(name = "SNDR", type = SNDR.class),
        @XmlElement(name = "RCVR", type = RCVR.class)
    })
    protected List<Object> sndrOrRCVR;
    @XmlAttribute(name = "MSG", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msg;

    /**
     * Gets the value of the sndrOrRCVR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndrOrRCVR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSNDROrRCVR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SNDR }
     * {@link RCVR }
     * 
     * 
     */
    public List<Object> getSNDROrRCVR() {
        if (sndrOrRCVR == null) {
            sndrOrRCVR = new ArrayList<Object>();
        }
        return this.sndrOrRCVR;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSG() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSG(String value) {
        this.msg = value;
    }

}
