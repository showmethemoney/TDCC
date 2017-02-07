package com.metrics.bean;

public class SecBlk
{
	private StlmPrty stlmPrty = null;
	private SecLeg secLeg = null;
	private String stlmdt = null;
	private String rsn = null;

	public StlmPrty getStlmPrty() {
		return stlmPrty;
	}

	public void setStlmPrty(StlmPrty stlmPrty) {
		this.stlmPrty = stlmPrty;
	}

	public SecLeg getSecLeg() {
		return secLeg;
	}

	public void setSecLeg(SecLeg secLeg) {
		this.secLeg = secLeg;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

	public String getRsn() {
		return rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

}
