package com.metrics.bean;

public class RPch
{
	private String stlmDt = null;
	private CshLeg cshLeg = new CshLeg();

	public String getStlmDt() {
		return stlmDt;
	}

	public void setStlmDt(String stlmDt) {
		this.stlmDt = stlmDt;
	}

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
	}

}
