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
 *         &lt;element ref="{}RECEIVER_BANK" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="REF" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FT_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FT_RSN" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="RDMP"/>
 *             &lt;enumeration value="BUND"/>
 *             &lt;enumeration value="CNSG"/>
 *             &lt;enumeration value="UNDW"/>
 *             &lt;enumeration value="REIS"/>
 *             &lt;enumeration value="CRI"/>
 *             &lt;enumeration value="FNAI"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *       &lt;attribute name="CNSG_CSH_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "receiverbank"
})
@XmlRootElement(name = "CSH_TRANSFER")
public class CSHTRANSFER {

    public CSHTRANSFER() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "RECEIVER_BANK")
    protected List<RECEIVERBANK> receiverbank;
    @XmlAttribute(name = "REF", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "ISIN", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "FT_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ftref;
    @XmlAttribute(name = "FT_RSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ftrsn;
    @XmlAttribute(name = "CSH_SYS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cshsys;
    @XmlAttribute(name = "CNSG_CSH_AMT")
    @XmlSchemaType(name = "anySimpleType")
    protected String cnsgcshamt;

    /**
     * Gets the value of the receiverbank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverbank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECEIVERBANK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECEIVERBANK }
     * 
     * 
     */
    public List<RECEIVERBANK> getRECEIVERBANK() {
        if (receiverbank == null) {
            receiverbank = new ArrayList<RECEIVERBANK>();
        }
        return this.receiverbank;
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
     * Gets the value of the ftref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTREF() {
        return ftref;
    }

    /**
     * Sets the value of the ftref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTREF(String value) {
        this.ftref = value;
    }

    /**
     * Gets the value of the ftrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTRSN() {
        return ftrsn;
    }

    /**
     * Sets the value of the ftrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTRSN(String value) {
        this.ftrsn = value;
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

    /**
     * Gets the value of the cnsgcshamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNSGCSHAMT() {
        return cnsgcshamt;
    }

    /**
     * Sets the value of the cnsgcshamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNSGCSHAMT(String value) {
        this.cnsgcshamt = value;
    }

}
