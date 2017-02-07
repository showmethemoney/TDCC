package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class FrstLeg
{
	private CshLeg cshLeg = null;
	private TaxImp taxImp = null;

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public TaxImp getTaxImp() {
		return taxImp;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
	}

	public void setTaxImp(TaxImp taxImp) {
		this.taxImp = taxImp;
	}

}
