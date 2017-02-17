package com.metrics.config;

import java.io.Serializable;


public class TCBConfig implements Serializable
{
	private String participantId = null;

	public TCBConfig() {}
	
	public TCBConfig(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

}
