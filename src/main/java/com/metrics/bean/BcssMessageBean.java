package com.metrics.bean;

public abstract class BcssMessageBean
{
	private String origin = null;
	private String ts = null;
	private String bcssbusdt = null;
	private String msgtype = null;
	private String narr = null;
	private String sndrref = null;
	private String action = null;
	private String resend = null;
	
	public BcssMessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getBcssbusdt() {
		return bcssbusdt;
	}
	public void setBcssbusdt(String bcssbusdt) {
		this.bcssbusdt = bcssbusdt;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public String getNarr() {
		return narr;
	}
	public void setNarr(String narr) {
		this.narr = narr;
	}
	public String getSndrref() {
		return sndrref;
	}
	public void setSndrref(String sndrref) {
		this.sndrref = sndrref;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getResend() {
		return resend;
	}
	public void setResend(String resend) {
		this.resend = resend;
	}
	
	
}
