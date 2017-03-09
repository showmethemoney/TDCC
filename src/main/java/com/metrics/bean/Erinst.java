package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class Erinst
{
	private StlmPrty stlmprty = new StlmPrty();
	private String isin = null;
	private String fval = null;
	private String issdays = null;
	private String matdt = null;
	private String issrt = null;
	private String bsprc = null;
	private String taxamt = null;
	private String cshsys = null;

	public StlmPrty getStlmprty() {
		return stlmprty;
	}

	public void setStlmprty(StlmPrty stlmprty) {
		this.stlmprty = stlmprty;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getFval() {
		return fval;
	}

	public void setFval(String fval) {
		this.fval = fval;
	}

	public String getIssdays() {
		return issdays;
	}

	public void setIssdays(String issdays) {
		this.issdays = issdays;
	}

	public String getMatdt() {
		return matdt;
	}

	public void setMatdt(String matdt) {
		this.matdt = matdt;
	}

	public String getIssrt() {
		return issrt;
	}

	public void setIssrt(String issrt) {
		this.issrt = issrt;
	}

	public String getBsprc() {
		return bsprc;
	}

	public void setBsprc(String bsprc) {
		this.bsprc = bsprc;
	}

	public String getTaxamt() {
		return taxamt;
	}

	public void setTaxamt(String taxamt) {
		this.taxamt = taxamt;
	}

	public String getCshsys() {
		return cshsys;
	}

	public void setCshsys(String cshsys) {
		this.cshsys = cshsys;
	}

}
