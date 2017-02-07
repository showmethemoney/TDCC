package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class BDLeg
{
	private String price = null;
	private String idays = null;
	private String accint = null;
	private String accinttax = null;

	public String getPrice() {
		return price;
	}

	public String getIdays() {
		return idays;
	}

	public String getAccint() {
		return accint;
	}

	public String getAccinttax() {
		return accinttax;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setIdays(String idays) {
		this.idays = idays;
	}

	public void setAccint(String accint) {
		this.accint = accint;
	}

	public void setAccinttax(String accinttax) {
		this.accinttax = accinttax;
	}

}
