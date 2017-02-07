package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class CshLeg
{
	private String cshccy = null;
	private String cshamt = null;
	private String afttaxamt = null;
	private String remitfee = null;

	public String getCshccy() {
		return cshccy;
	}

	public String getCshamt() {
		return cshamt;
	}

	public String getAfttaxamt() {
		return afttaxamt;
	}

	public String getRemitfee() {
		return remitfee;
	}

	public void setCshccy(String cshccy) {
		this.cshccy = cshccy;
	}

	public void setCshamt(String cshamt) {
		this.cshamt = cshamt;
	}

	public void setAfttaxamt(String afttaxamt) {
		this.afttaxamt = afttaxamt;
	}

	public void setRemitfee(String remitfee) {
		this.remitfee = remitfee;
	}

}
