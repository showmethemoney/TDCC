package com.metrics.bean;

public class RepSec
{

	private RepSecVal repSecVal = new RepSecVal();
	private RepSec repSec = new RepSec();
	private String secnm = null;

	public RepSecVal getRepSecVal() {
		return repSecVal;
	}

	public void setRepSecVal(RepSecVal repSecVal) {
		this.repSecVal = repSecVal;
	}

	public RepSec getRepSec() {
		return repSec;
	}

	public void setRepSec(RepSec repSec) {
		this.repSec = repSec;
	}

	public String getSecnm() {
		return secnm;
	}

	public void setSecnm(String secnm) {
		this.secnm = secnm;
	}

}
