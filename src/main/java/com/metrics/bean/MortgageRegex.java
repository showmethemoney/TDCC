package com.metrics.bean;

public class MortgageRegex
{
	private Prty prty = null;
	private Cprty cprty = null;
	private SecLeg secLeg = null;
	private String ref = null;
	private String stlmdt = null;
	private String cntrid = null;
	private String dealside = null;

	public Prty getPrty() {
		return prty;
	}

	public void setPrty(Prty prty) {
		this.prty = prty;
	}

	public Cprty getCprty() {
		return cprty;
	}

	public void setCprty(Cprty cprty) {
		this.cprty = cprty;
	}

	public SecLeg getSecLeg() {
		return secLeg;
	}

	public void setSecLeg(SecLeg secLeg) {
		this.secLeg = secLeg;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

	public String getCntrid() {
		return cntrid;
	}

	public void setCntrid(String cntrid) {
		this.cntrid = cntrid;
	}

	public String getDealside() {
		return dealside;
	}

	public void setDealside(String dealside) {
		this.dealside = dealside;
	}

}
