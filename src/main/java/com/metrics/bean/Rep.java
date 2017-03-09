package com.metrics.bean;

public class Rep
{
	private RepSec repsec = new RepSec();
	private String repnm = null;
	private String repid = null;
	private String prtyid = null;
	private String sndrref = null;
	private String page = null;
	private String ttlpage = null;
	private String stlmdt = null;

	public RepSec getRepsec() {
		return repsec;
	}

	public void setRepsec(RepSec repsec) {
		this.repsec = repsec;
	}

	public String getRepnm() {
		return repnm;
	}

	public void setRepnm(String repnm) {
		this.repnm = repnm;
	}

	public String getRepid() {
		return repid;
	}

	public void setRepid(String repid) {
		this.repid = repid;
	}

	public String getPrtyid() {
		return prtyid;
	}

	public void setPrtyid(String prtyid) {
		this.prtyid = prtyid;
	}

	public String getSndrref() {
		return sndrref;
	}

	public void setSndrref(String sndrref) {
		this.sndrref = sndrref;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTtlpage() {
		return ttlpage;
	}

	public void setTtlpage(String ttlpage) {
		this.ttlpage = ttlpage;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

}
