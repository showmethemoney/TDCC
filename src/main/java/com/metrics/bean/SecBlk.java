package com.metrics.bean;

public class SecBlk
{
	private StlmPrty stlmprty = new StlmPrty();
	private SecLeg secLeg = new SecLeg();
	private String stlmdt = null;
	private String rsn = null;

	public StlmPrty getStlmprty() {
		return stlmprty;
	}

	public SecLeg getSecLeg() {
		return secLeg;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public String getRsn() {
		return rsn;
	}

	public void setStlmprty(StlmPrty stlmprty) {
		this.stlmprty = stlmprty;
	}

	public void setSecLeg(SecLeg secLeg) {
		this.secLeg = secLeg;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

}
