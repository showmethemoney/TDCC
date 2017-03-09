package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class SecGenLeg
{
	private SecUnitsLeg secUnitsLeg = new SecUnitsLeg();
	private FrstLeg frstLeg = new FrstLeg();
	private ScndLeg scndLeg = new ScndLeg();
	private BDLeg bdLeg = new BDLeg();
	private String genid = null;
	private String secamt = null;

	public SecUnitsLeg getSecUnitsLeg() {
		return secUnitsLeg;
	}

	public FrstLeg getFrstLeg() {
		return frstLeg;
	}

	public ScndLeg getScndLeg() {
		return scndLeg;
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

	public void setScndLeg(ScndLeg scndLeg) {
		this.scndLeg = scndLeg;
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
