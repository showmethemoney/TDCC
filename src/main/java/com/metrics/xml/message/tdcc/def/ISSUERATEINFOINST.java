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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PRTY_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISS_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDMP_AMT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ISSUERATEINFO_INST")
public class ISSUERATEINFOINST {

    public ISSUERATEINFOINST() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "PRTY_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String prtyid;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "ISS_RT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String issrt;
    @XmlAttribute(name = "RDMP_AMT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmpamt;

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
     * Gets the value of the rdmpamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDMPAMT() {
        return rdmpamt;
    }

    /**
     * Sets the value of the rdmpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDMPAMT(String value) {
        this.rdmpamt = value;
    }

}
