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
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="F_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IP_ADDR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="F_NM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="F_DIR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="USR_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PWD" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FL_TRANS")
public class FLTRANS {

    public FLTRANS() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "F_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String fid;
    @XmlAttribute(name = "IP_ADDR")
    @XmlSchemaType(name = "anySimpleType")
    protected String ipaddr;
    @XmlAttribute(name = "F_NM")
    @XmlSchemaType(name = "anySimpleType")
    protected String fnm;
    @XmlAttribute(name = "F_DIR")
    @XmlSchemaType(name = "anySimpleType")
    protected String fdir;
    @XmlAttribute(name = "USR_ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String usrid;
    @XmlAttribute(name = "PWD")
    @XmlSchemaType(name = "anySimpleType")
    protected String pwd;

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
     * Gets the value of the fid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFID() {
        return fid;
    }

    /**
     * Sets the value of the fid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFID(String value) {
        this.fid = value;
    }

    /**
     * Gets the value of the ipaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPADDR() {
        return ipaddr;
    }

    /**
     * Sets the value of the ipaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPADDR(String value) {
        this.ipaddr = value;
    }

    /**
     * Gets the value of the fnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNM() {
        return fnm;
    }

    /**
     * Sets the value of the fnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNM(String value) {
        this.fnm = value;
    }

    /**
     * Gets the value of the fdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDIR() {
        return fdir;
    }

    /**
     * Sets the value of the fdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDIR(String value) {
        this.fdir = value;
    }

    /**
     * Gets the value of the usrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRID() {
        return usrid;
    }

    /**
     * Sets the value of the usrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRID(String value) {
        this.usrid = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWD() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWD(String value) {
        this.pwd = value;
    }

}
