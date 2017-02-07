package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class SecLeg
{
	protected SecGenLeg secGenLeg;
	protected String isin;
	protected String mgcntrid;

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
