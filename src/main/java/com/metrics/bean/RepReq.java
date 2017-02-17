package com.metrics.bean;

public class RepReq
{

	private Crit crit = null;
	private String prtyid = null;
	private String repnm = null;
	private String repid = null;

	public Crit getCrit() {
		return crit;
	}

	public String getPrtyid() {
		return prtyid;
	}

	public String getRepnm() {
		return repnm;
	}

	public String getRepid() {
		return repid;
	}

	public void setCrit(Crit crit) {
		this.crit = crit;
	}

	public void setPrtyid(String prtyid) {
		this.prtyid = prtyid;
	}

	public void setRepnm(String repnm) {
		this.repnm = repnm;
	}

	public void setRepid(String repid) {
		this.repid = repid;
	}

}
