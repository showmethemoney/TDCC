package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class CshAdvice
{
	protected Prty prty;
	protected Cprty cprty;
	protected SecLeg secLeg;
	protected CshLeg cshLeg;

	protected String ref;
	protected String tsfside;
	protected String ftref;
	protected String cntrid;
	protected String bndlref;
	protected String rdmptaxamt;
	protected String cshsys;
	protected String healinsufee;

	public Prty getPrty() {
		return prty;
	}

	public Cprty getCprty() {
		return cprty;
	}

	public SecLeg getSecLeg() {
		return secLeg;
	}

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public String getRef() {
		return ref;
	}

	public String getTsfside() {
		return tsfside;
	}

	public String getFtref() {
		return ftref;
	}

	public String getCntrid() {
		return cntrid;
	}

	public String getBndlref() {
		return bndlref;
	}

	public String getRdmptaxamt() {
		return rdmptaxamt;
	}

	public String getCshsys() {
		return cshsys;
	}

	public String getHealinsufee() {
		return healinsufee;
	}

	public void setPrty(Prty prty) {
		this.prty = prty;
	}

	public void setCprty(Cprty cprty) {
		this.cprty = cprty;
	}

	public void setSecLeg(SecLeg secLeg) {
		this.secLeg = secLeg;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public void setTsfside(String tsfside) {
		this.tsfside = tsfside;
	}

	public void setFtref(String ftref) {
		this.ftref = ftref;
	}

	public void setCntrid(String cntrid) {
		this.cntrid = cntrid;
	}

	public void setBndlref(String bndlref) {
		this.bndlref = bndlref;
	}

	public void setRdmptaxamt(String rdmptaxamt) {
		this.rdmptaxamt = rdmptaxamt;
	}

	public void setCshsys(String cshsys) {
		this.cshsys = cshsys;
	}

	public void setHealinsufee(String healinsufee) {
		this.healinsufee = healinsufee;
	}

}
