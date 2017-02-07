package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class SecLeg
{
	private SecGenLeg secGenLeg = null;
	private String isin = null;
	private String mgcntrid = null;

	public SecGenLeg getSecGenLeg() {
		return secGenLeg;
	}

	public String getIsin() {
		return isin;
	}

	public String getMgcntrid() {
		return mgcntrid;
	}

	public void setSecGenLeg(SecGenLeg secGenLeg) {
		this.secGenLeg = secGenLeg;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public void setMgcntrid(String mgcntrid) {
		this.mgcntrid = mgcntrid;
	}

}
