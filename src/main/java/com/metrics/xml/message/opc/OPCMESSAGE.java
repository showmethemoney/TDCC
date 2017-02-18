//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.05 at 07:26:03 PM CST 
//

package com.metrics.xml.message.opc;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}CHG_KEY_REQ"/>
 *         &lt;element ref="{}CHG_KEY"/>
 *         &lt;element ref="{}CHG_KEY_RSP"/>
 *         &lt;element ref="{}CHG_KEY_CFRM"/>
 *         &lt;element ref="{}KEY_SYNC"/>
 *         &lt;element ref="{}KEY_SYNC_RSP"/>
 *       &lt;/choice>
 *       &lt;attribute name="ORIGIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MSG_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0100"/>
 *             &lt;enumeration value="0200"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PRC_CODE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0100"/>
 *             &lt;enumeration value="0102"/>
 *             &lt;enumeration value="0103"/>
 *             &lt;enumeration value="0104"/>
 *             &lt;enumeration value="0211"/>
 *             &lt;enumeration value="0222"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AUDIT_NO" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RSP_CODE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0000"/>
 *             &lt;enumeration value="0001"/>
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
@XmlAccessorType(XmlAccessType.NONE)
public abstract class OPCMESSAGE implements Serializable
{
	
	@XmlTransient
	public static final String RESPONSE_SUCCESS = "0001";
	@XmlTransient
	public static final String RESPONSE_TIMEOUT = "0103" ;
	@XmlTransient
	public static final String RESPONSE_UNKNOWN_ERROR = "0104" ;
	@XmlTransient
	public static final String RESPONSE_XML_ERROR = "0106" ;
	@XmlTransient
	public static final String RESPONSE_MAC_ERROR = "0302";
	@XmlTransient
	public static final String RESPONSE_AR_ERROR = "0304";
	
	public OPCMESSAGE() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @XmlElement(name = "CHG_KEY_REQ")
	// protected CHGKEYREQ chgkeyreq;
	// @XmlElement(name = "CHG_KEY")
	// protected CHGKEY chgkey;
	// @XmlElement(name = "CHG_KEY_RSP")
	// protected CHGKEYRSP chgkeyrsp;
	// @XmlElement(name = "CHG_KEY_CFRM")
	// protected CHGKEYCFRM chgkeycfrm;
	// @XmlElement(name = "KEY_SYNC")
	// protected KEYSYNC keysync;
	// @XmlElement(name = "KEY_SYNC_RSP")
	// protected KEYSYNCRSP keysyncrsp;
	@XmlAttribute(name = "ORIGIN", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String origin;
	@XmlAttribute(name = "MSG_TYPE", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String msgtype;
	@XmlAttribute(name = "PRC_CODE", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String prccode;
	@XmlAttribute(name = "AUDIT_NO", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String auditno;
	@XmlAttribute(name = "TS", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String ts;
	@XmlAttribute(name = "RSP_CODE", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String rspcode;

	/**
	 * Gets the value of the origin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getORIGIN() {
		return origin;
	}

	/**
	 * Sets the value of the origin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setORIGIN(String value) {
		this.origin = value;
	}

	/**
	 * Gets the value of the msgtype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMSGTYPE() {
		return msgtype;
	}

	/**
	 * Sets the value of the msgtype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMSGTYPE(String value) {
		this.msgtype = value;
	}

	/**
	 * Gets the value of the prccode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPRCCODE() {
		return prccode;
	}

	/**
	 * Sets the value of the prccode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPRCCODE(String value) {
		this.prccode = value;
	}

	/**
	 * Gets the value of the auditno property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAUDITNO() {
		return auditno;
	}

	/**
	 * Sets the value of the auditno property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAUDITNO(String value) {
		this.auditno = value;
	}

	/**
	 * Gets the value of the ts property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTS() {
		return ts;
	}

	/**
	 * Sets the value of the ts property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTS(String value) {
		this.ts = value;
	}

	/**
	 * Gets the value of the rspcode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRSPCODE() {
		return rspcode;
	}

	/**
	 * Sets the value of the rspcode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRSPCODE(String value) {
		this.rspcode = value;
	}

}
