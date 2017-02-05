package com.metrics.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPC_KEY")
public class OPCKey implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private String id = null;
	
	@Column(name = "KEY")
	private String key = null;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate = null;
}
