package com.metrics.bean;

public class ModRepo
{
	private CshLeg cshLeg = new CshLeg();
	private SecLeg secLeg = new SecLeg();
	private String ref = null;
	private String prtyid = null;
	private String cprtyid = null;
	private String cntrid = null;
	private String trdrt = null;
	private String rpchstlmdt = null;

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
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

	public String getPrtyid() {
		return prtyid;
	}

	public void setPrtyid(String prtyid) {
		this.prtyid = prtyid;
	}

	public String getCprtyid() {
		return cprtyid;
	}

	public void setCprtyid(String cprtyid) {
		this.cprtyid = cprtyid;
	}

	public String getCntrid() {
		return cntrid;
	}

	public void setCntrid(String cntrid) {
		this.cntrid = cntrid;
	}

	public String getTrdrt() {
		return trdrt;
	}

	public void setTrdrt(String trdrt) {
		this.trdrt = trdrt;
	}

	public String getRpchstlmdt() {
		return rpchstlmdt;
	}

	public void setRpchstlmdt(String rpchstlmdt) {
		this.rpchstlmdt = rpchstlmdt;
	}

}
