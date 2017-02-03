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
	
	public String getOrigin() {
		return origin;
	}
	public String getTs() {
		return ts;
	}
	public String getBcssbusdt() {
		return bcssbusdt;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public String getNarr() {
		return narr;
	}
	public String getSndrref() {
		return sndrref;
	}
	public String getAction() {
		return action;
	}
	public String getResend() {
		return resend;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public void setBcssbusdt(String bcssbusdt) {
		this.bcssbusdt = bcssbusdt;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public void setNarr(String narr) {
		this.narr = narr;
	}
	public void setSndrref(String sndrref) {
		this.sndrref = sndrref;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setResend(String resend) {
		this.resend = resend;
	}
	
}
