package com.metrics.bean;

public class OpenRepo
{
	private Prty prty = new Prty();
	private Cprty cprty = new Cprty();
	private Pch pch = new Pch();
	private RPch rpch = new RPch();
	private SecLeg secLeg = new SecLeg();
	private String ref = null;
	private String cbid = null;
	private String bndlref = null;
	private String bndlttl = null;
	private String dealside = null;
	private String trddt = null;
	private String prevrepoid = null;
	private String rerepoauth = null;
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

	public Pch getPch() {
		return pch;
	}

	public void setPch(Pch pch) {
		this.pch = pch;
	}

	public RPch getRpch() {
		return rpch;
	}

	public void setRpch(RPch rpch) {
		this.rpch = rpch;
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

	public String getDealside() {
		return dealside;
	}

	public void setDealside(String dealside) {
		this.dealside = dealside;
	}

	public String getTrddt() {
		return trddt;
	}

	public void setTrddt(String trddt) {
		this.trddt = trddt;
	}

	public String getPrevrepoid() {
		return prevrepoid;
	}

	public void setPrevrepoid(String prevrepoid) {
		this.prevrepoid = prevrepoid;
	}

	public String getRerepoauth() {
		return rerepoauth;
	}

	public void setRerepoauth(String rerepoauth) {
		this.rerepoauth = rerepoauth;
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
