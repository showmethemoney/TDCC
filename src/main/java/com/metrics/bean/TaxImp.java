package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class TaxImp
{
	private String taxamt = null;
	private String rdmptaxamt = null;
	private String clsdtaxamt = null;
	private String futtaxamt = null;

	public String getTaxamt() {
		return taxamt;
	}

	public String getRdmptaxamt() {
		return rdmptaxamt;
	}

	public String getClsdtaxamt() {
		return clsdtaxamt;
	}

	public String getFuttaxamt() {
		return futtaxamt;
	}

	public void setTaxamt(String taxamt) {
		this.taxamt = taxamt;
	}

	public void setRdmptaxamt(String rdmptaxamt) {
		this.rdmptaxamt = rdmptaxamt;
	}

	public void setClsdtaxamt(String clsdtaxamt) {
		this.clsdtaxamt = clsdtaxamt;
	}

	public void setFuttaxamt(String futtaxamt) {
		this.futtaxamt = futtaxamt;
	}

}
