package com.metrics.config;

import java.io.Serializable;


public class TCBConfig implements Serializable
{
	private String participantId = null;
	private String requestSaveXmlPath = null;
	private String responseSaveXmlPath = null;

	public TCBConfig() {}

	public TCBConfig(String participantId, String requestSaveXmlPath, String responseSaveXmlPath) {
		super();
		this.participantId = participantId;
		this.requestSaveXmlPath = requestSaveXmlPath;
		this.responseSaveXmlPath = responseSaveXmlPath;
	}

	public String getParticipantId() {
		return participantId;
	}

	public String getRequestSaveXmlPath() {
		return requestSaveXmlPath;
	}

	public String getResponseSaveXmlPath() {
		return responseSaveXmlPath;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public void setRequestSaveXmlPath(String requestSaveXmlPath) {
		this.requestSaveXmlPath = requestSaveXmlPath;
	}

	public void setResponseSaveXmlPath(String responseSaveXmlPath) {
		this.responseSaveXmlPath = responseSaveXmlPath;
	}

}
