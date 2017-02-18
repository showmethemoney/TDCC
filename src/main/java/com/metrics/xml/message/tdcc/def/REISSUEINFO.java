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
 *         &lt;element ref="{}SEC_GEN_LEG" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="REI_ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REI_BS_PRC" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REI_RDMP_TAX_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REI_TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secgenleg"
})
@XmlRootElement(name = "REISSUE_INFO")
public class REISSUEINFO {

    public REISSUEINFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "SEC_GEN_LEG")
    protected List<SECGENLEG> secgenleg;
    @XmlAttribute(name = "REI_ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reiisin;
    @XmlAttribute(name = "REI_BS_PRC", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reibsprc;
    @XmlAttribute(name = "REI_RDMP_TAX_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reirdmptaxamt;
    @XmlAttribute(name = "REI_TRD_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reitrdrt;

    /**
     * Gets the value of the secgenleg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secgenleg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECGENLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECGENLEG }
     * 
     * 
     */
    public List<SECGENLEG> getSECGENLEG() {
        if (secgenleg == null) {
            secgenleg = new ArrayList<SECGENLEG>();
        }
        return this.secgenleg;
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
     * Gets the value of the reibsprc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREIBSPRC() {
        return reibsprc;
    }

    /**
     * Sets the value of the reibsprc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREIBSPRC(String value) {
        this.reibsprc = value;
    }

    /**
     * Gets the value of the reirdmptaxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREIRDMPTAXAMT() {
        return reirdmptaxamt;
    }

    /**
     * Sets the value of the reirdmptaxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREIRDMPTAXAMT(String value) {
        this.reirdmptaxamt = value;
    }

    /**
     * Gets the value of the reitrdrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREITRDRT() {
        return reitrdrt;
    }

    /**
     * Sets the value of the reitrdrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREITRDRT(String value) {
        this.reitrdrt = value;
    }

}
