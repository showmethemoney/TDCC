package com.metrics.bean;

/**
 * @author Ethan Lee
 */

public class CloseRepo
{
	private Prty prty = new Prty();
	private Cprty cprty = new Cprty();
	private String ref = null;
	private String cntrid = null;
	private String cshamt = null;
	private String xtrint = null;
	private String bndlref = null;
	private String bndlttl = null;
	private String cshsys = null;

	public Prty getPrty() {
		return prty;
	}

	public Cprty getCprty() {
		return cprty;
	}

	public String getRef() {
		return ref;
	}

	public String getCntrid() {
		return cntrid;
	}

	public String getCshamt() {
		return cshamt;
	}

	public String getXtrint() {
		return xtrint;
	}

	public String getBndlref() {
		return bndlref;
	}

	public String getBndlttl() {
		return bndlttl;
	}

	public String getCshsys() {
		return cshsys;
	}

	public void setPrty(Prty prty) {
		this.prty = prty;
	}

	public void setCprty(Cprty cprty) {
		this.cprty = cprty;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public void setCntrid(String cntrid) {
		this.cntrid = cntrid;
	}

	public void setCshamt(String cshamt) {
		this.cshamt = cshamt;
	}

	public void setXtrint(String xtrint) {
		this.xtrint = xtrint;
	}

	public void setBndlref(String bndlref) {
		this.bndlref = bndlref;
	}

	public void setBndlttl(String bndlttl) {
		this.bndlttl = bndlttl;
	}

	public void setCshsys(String cshsys) {
		this.cshsys = cshsys;
	}

}
