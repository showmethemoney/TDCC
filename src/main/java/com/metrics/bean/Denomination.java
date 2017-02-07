package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class Denomination
{
	private String id = null;
	private String fval = null;
	private String uval = null;
	private String units = null;
	private String histtax = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFval() {
		return fval;
	}

	public void setFval(String fval) {
		this.fval = fval;
	}

	public String getUval() {
		return uval;
	}

	public void setUval(String uval) {
		this.uval = uval;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getHisttax() {
		return histtax;
	}

	public void setHisttax(String histtax) {
		this.histtax = histtax;
	}

}
