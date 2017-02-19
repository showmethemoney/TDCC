package com.metrics.config;

import java.io.Serializable;

public class RAConfig implements Serializable
{
	private String cdKey = null;
	private String workingKey = null;
	private String newWorkingKey = null;
	private String serverIP = null;
	private String loginId = null;
	private String password = null;
	private String retryTimes = null;
	private String retryDuration = null;

	public RAConfig(String cdKey, String workingKey, String newWorkingKey, String serverIP, String loginId, String password, String retryTimes,
	        String retryDuration) {
		super();
		this.cdKey = cdKey;
		this.workingKey = workingKey;
		this.newWorkingKey = newWorkingKey;
		this.serverIP = serverIP;
		this.loginId = loginId;
		this.password = password;
		this.retryTimes = retryTimes;
		this.retryDuration = retryDuration;
	}

	public String getCdKey() {
		return cdKey;
	}

	public void setCdKey(String cdKey) {
		this.cdKey = cdKey;
	}

	public String getWorkingKey() {
		return workingKey;
	}

	public void setWorkingKey(String workingKey) {
		this.workingKey = workingKey;
	}

	public String getNewWorkingKey() {
		return newWorkingKey;
	}

	public void setNewWorkingKey(String newWorkingKey) {
		this.newWorkingKey = newWorkingKey;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetryTimes() {
		return retryTimes;
	}

	public void setRetryTimes(String retryTimes) {
		this.retryTimes = retryTimes;
	}

	public String getRetryDuration() {
		return retryDuration;
	}

	public void setRetryDuration(String retryDuration) {
		this.retryDuration = retryDuration;
	}

}
