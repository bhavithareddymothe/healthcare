package com.slokam.slokamprm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appoinment1")
public class Appoinment1 {
	@Id
	@GeneratedValue
	private Long id;
	private Date dateTime;
	private String primaryReason;
	
	public String getPrimaryReason() {
		return primaryReason;
	}
	public void setPrimaryReason(String primaryReason) {
		this.primaryReason = primaryReason;
	}
	@ManyToOne
	@JoinColumn(name="pid")
	private Patient1 p1;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Patient1 getP1() {
		return p1;
	}
	public void setP1(Patient1 p1) {
		this.p1 = p1;
	}
	
	

}
