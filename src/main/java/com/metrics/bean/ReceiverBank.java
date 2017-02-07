package com.metrics.bean;

/**
 * @author Ethan Lee
 */
public class ReceiverBank
{
	private CshLeg cshleg = null;
	private String id = null;
	private String bnfynm = null;
	private String acctid = null;
	private String swift = null;
	private String orgsndrref = null;

	public CshLeg getCshleg() {
		return cshleg;
	}

	public String getId() {
		return id;
	}

	public String getBnfynm() {
		return bnfynm;
	}

	public String getAcctid() {
		return acctid;
	}

	public String getSwift() {
		return swift;
	}

	public String getOrgsndrref() {
		return orgsndrref;
	}

	public void setCshleg(CshLeg cshleg) {
		this.cshleg = cshleg;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBnfynm(String bnfynm) {
		this.bnfynm = bnfynm;
	}

	public void setAcctid(String acctid) {
		this.acctid = acctid;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public void setOrgsndrref(String orgsndrref) {
		this.orgsndrref = orgsndrref;
	}

}
