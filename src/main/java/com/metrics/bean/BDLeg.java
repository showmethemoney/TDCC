package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class BDLeg
{
	protected String price;
	protected String idays;
	protected String accint;
	protected String accinttax;

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
