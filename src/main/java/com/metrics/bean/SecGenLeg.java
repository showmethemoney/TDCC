package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class SecGenLeg
{
	private SecUnitsLeg secUnitsLeg = null;
	private FrstLeg frstLeg = null;
	private ScndLeg scendLeg = null;
	private BDLeg bdLeg = null;
	private String genid = null;
	private String secamt = null;

	public SecUnitsLeg getSecUnitsLeg() {
		return secUnitsLeg;
	}

	public FrstLeg getFrstLeg() {
		return frstLeg;
	}

	public ScndLeg getScendLeg() {
		return scendLeg;
	}

	public BDLeg getBdLeg() {
		return bdLeg;
	}

	public String getGenid() {
		return genid;
	}

	public String getSecamt() {
		return secamt;
	}

	public void setSecUnitsLeg(SecUnitsLeg secUnitsLeg) {
		this.secUnitsLeg = secUnitsLeg;
	}

	public void setFrstLeg(FrstLeg frstLeg) {
		this.frstLeg = frstLeg;
	}

	public void setScendLeg(ScndLeg scendLeg) {
		this.scendLeg = scendLeg;
	}

	public void setBdLeg(BDLeg bdLeg) {
		this.bdLeg = bdLeg;
	}

	public void setGenid(String genid) {
		this.genid = genid;
	}

	public void setSecamt(String secamt) {
		this.secamt = secamt;
	}

}
