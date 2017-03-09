package com.metrics.bean;

public class SecStlm
{

	private Prty prty = new Prty();
	private Cprty cprty = new Cprty();
	private SecLeg secLeg = new SecLeg();
	private CshLeg cshLeg = new CshLeg();
	private String ref = null;
	private String cbid = null;
	private String bndlref = null;
	private String bndlttl = null;
	private String dealtype = null;
	private String dealside = null;
	private String stlmdt = null;
	private String trddt = null;
	private String trdrt = null;
	private String cshsys = null;

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

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getCbid() {
		return cbid;
	}

	public void setCbid(String cbid) {
		this.cbid = cbid;
	}

	public String getBndlref() {
		return bndlref;
	}

	public void setBndlref(String bndlref) {
		this.bndlref = bndlref;
	}

	public String getBndlttl() {
		return bndlttl;
	}

	public void setBndlttl(String bndlttl) {
		this.bndlttl = bndlttl;
	}

	public String getDealtype() {
		return dealtype;
	}

	public void setDealtype(String dealtype) {
		this.dealtype = dealtype;
	}

	public String getDealside() {
		return dealside;
	}

	public void setDealside(String dealside) {
		this.dealside = dealside;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

	public String getTrddt() {
		return trddt;
	}

	public void setTrddt(String trddt) {
		this.trddt = trddt;
	}

	public String getTrdrt() {
		return trdrt;
	}

	public void setTrdrt(String trdrt) {
		this.trdrt = trdrt;
	}

	public String getCshsys() {
		return cshsys;
	}

	public void setCshsys(String cshsys) {
		this.cshsys = cshsys;
	}

}
