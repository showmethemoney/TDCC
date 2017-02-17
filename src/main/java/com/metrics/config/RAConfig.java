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
	
	public RAConfig(String cdKey, String workingKey, String newWorkingKey, String serverIP, String loginId, String password) {
		super();
		this.cdKey = cdKey;
		this.workingKey = workingKey;
		this.newWorkingKey = newWorkingKey;
		this.serverIP = serverIP;
		this.loginId = loginId;
		this.password = password;
	}

	public String getCdKey() {
		return cdKey;
	}

	public String getWorkingKey() {
		return workingKey;
	}

	public String getNewWorkingKey() {
		return newWorkingKey;
	}

	public String getServerIP() {
		return serverIP;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setCdKey(String cdKey) {
		this.cdKey = cdKey;
	}

	public void setWorkingKey(String workingKey) {
		this.workingKey = workingKey;
	}

	public void setNewWorkingKey(String newWorkingKey) {
		this.newWorkingKey = newWorkingKey;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
