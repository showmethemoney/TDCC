package com.metrics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "HISTORY_REQUEST")
public class HistoryRequest
{
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id = null;
	@Column(name = "ORIGIN")
	private String origin = null;
	@Column(name = "TS")
	private String ts = null;
	@Column(name = "BCSS_BUS_DT")
	private String bcssBusDt = null;
	@Column(name = "MSG_TYPE")
	private String msgType = null;
	@Column(name = "NARR")
	private String narr = null;
	@Column(name = "SNDR_REF")
	private String sndrRef = null;
	@Column(name = "MSG_ACTION")
	private String action = null;
	@Column(name = "RESEND")
	private String resend = null;

	public HistoryRequest() {
	}

	public HistoryRequest(String origin, String ts, String bcssBusDt, String msgType, String narr, String sndrRef, String action, String resend) {
		super();
		this.origin = origin;
		this.ts = ts;
		this.bcssBusDt = bcssBusDt;
		this.msgType = msgType;
		this.narr = narr;
		this.sndrRef = sndrRef;
		this.action = action;
		this.resend = resend;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getBcssBusDt() {
		return bcssBusDt;
	}

	public void setBcssBusDt(String bcssBusDt) {
		this.bcssBusDt = bcssBusDt;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getNarr() {
		return narr;
	}

	public void setNarr(String narr) {
		this.narr = narr;
	}

	public String getSndrRef() {
		return sndrRef;
	}

	public void setSndrRef(String sndrRef) {
		this.sndrRef = sndrRef;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResend() {
		return resend;
	}

	public void setResend(String resend) {
		this.resend = resend;
	}

}
