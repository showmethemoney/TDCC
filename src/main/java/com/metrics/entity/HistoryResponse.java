package com.metrics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="HISTORY_RESPONSE")
public class HistoryResponse
{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private String id = null;
}