package com.metrics.xml.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * @author Ethan Lee
 */
@XmlAccessorType(XmlAccessType.NONE)
public abstract class BCSSMESSAGE implements Serializable
{
	@XmlAttribute(name = "ORIGIN", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String origin;
	@XmlAttribute(name = "TS", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String ts;
	@XmlAttribute(name = "BCSS_BUS_DT", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String bcssbusdt;
	@XmlAttribute(name = "MSG_TYPE", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String msgtype;
	@XmlAttribute(name = "NARR")
	@XmlSchemaType(name = "anySimpleType")
	protected String narr;
	@XmlAttribute(name = "SNDR_REF", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String sndrref;
	@XmlAttribute(name = "ACTION", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String action;
	@XmlAttribute(name = "RESEND")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String resend;
	
	 /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGIN() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGIN(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTS() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTS(String value) {
        this.ts = value;
    }

    /**
     * Gets the value of the bcssbusdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCSSBUSDT() {
        return bcssbusdt;
    }

    /**
     * Sets the value of the bcssbusdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCSSBUSDT(String value) {
        this.bcssbusdt = value;
    }

    /**
     * Gets the value of the msgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTYPE() {
        return msgtype;
    }

    /**
     * Sets the value of the msgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTYPE(String value) {
        this.msgtype = value;
    }

    /**
     * Gets the value of the narr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNARR() {
        return narr;
    }

    /**
     * Sets the value of the narr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNARR(String value) {
        this.narr = value;
    }

    /**
     * Gets the value of the sndrref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDRREF() {
        return sndrref;
    }

    /**
     * Sets the value of the sndrref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDRREF(String value) {
        this.sndrref = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the resend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESEND() {
        return resend;
    }

    /**
     * Sets the value of the resend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESEND(String value) {
        this.resend = value;
    } 
	
}
