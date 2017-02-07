package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class CshLeg
{
	protected String cshccy;
	protected String cshamt;
	protected String afttaxamt;
	protected String remitfee;

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
