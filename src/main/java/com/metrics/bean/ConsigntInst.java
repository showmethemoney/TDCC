package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class ConsigntInst
{
	private StlmPrty stlmprty = new StlmPrty();
	private CshLeg cshLeg = new CshLeg();
	private ReceiverBank receiverBank = new ReceiverBank();
	private String prtyid = null;
	private String isin = null;
	private String dbcshamt = null;
	private String cnsgfee = null;
	private String stlmdt = null;
	private String cbid = null;
	private String bsprc = null;
	private String taxamt = null;
	private String trdrt = null;
	private String cshsys = null;
	private String undfee = null;
	private String cnsfee = null;
	private String gutfee = null;

	public StlmPrty getStlmprty() {
		return stlmprty;
	}

	public CshLeg getCshLeg() {
		return cshLeg;
	}

	public ReceiverBank getReceiverBank() {
		return receiverBank;
	}

	public String getPrtyid() {
		return prtyid;
	}

	public String getIsin() {
		return isin;
	}

	public String getDbcshamt() {
		return dbcshamt;
	}

	public String getCnsgfee() {
		return cnsgfee;
	}

	public String getStlmdt() {
		return stlmdt;
	}

	public String getCbid() {
		return cbid;
	}

	public String getBsprc() {
		return bsprc;
	}

	public String getTaxamt() {
		return taxamt;
	}

	public String getTrdrt() {
		return trdrt;
	}

	public String getCshsys() {
		return cshsys;
	}

	public String getUndfee() {
		return undfee;
	}

	public String getCnsfee() {
		return cnsfee;
	}

	public String getGutfee() {
		return gutfee;
	}

	public void setStlmprty(StlmPrty stlmprty) {
		this.stlmprty = stlmprty;
	}

	public void setCshLeg(CshLeg cshLeg) {
		this.cshLeg = cshLeg;
	}

	public void setReceiverBank(ReceiverBank receiverBank) {
		this.receiverBank = receiverBank;
	}

	public void setPrtyid(String prtyid) {
		this.prtyid = prtyid;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public void setDbcshamt(String dbcshamt) {
		this.dbcshamt = dbcshamt;
	}

	public void setCnsgfee(String cnsgfee) {
		this.cnsgfee = cnsgfee;
	}

	public void setStlmdt(String stlmdt) {
		this.stlmdt = stlmdt;
	}

	public void setCbid(String cbid) {
		this.cbid = cbid;
	}

	public void setBsprc(String bsprc) {
		this.bsprc = bsprc;
	}

	public void setTaxamt(String taxamt) {
		this.taxamt = taxamt;
	}

	public void setTrdrt(String trdrt) {
		this.trdrt = trdrt;
	}

	public void setCshsys(String cshsys) {
		this.cshsys = cshsys;
	}

	public void setUndfee(String undfee) {
		this.undfee = undfee;
	}

	public void setCnsfee(String cnsfee) {
		this.cnsfee = cnsfee;
	}

	public void setGutfee(String gutfee) {
		this.gutfee = gutfee;
	}

}
