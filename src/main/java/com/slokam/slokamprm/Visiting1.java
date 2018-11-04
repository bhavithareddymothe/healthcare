package com.slokam.slokamprm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visiting1")
public class Visiting1 {
	@Id
	@GeneratedValue
	private Long id;
	private Date dateTime;
	@OneToOne
	@JoinColumn(name="aid")
	private Appoinment1 appoinmnt;
	@ManyToOne
	@JoinColumn(name="did")
	private Doctor1 d1;
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
	public Appoinment1 getAppoinmnt() {
		return appoinmnt;
	}
	public void setAppoinmnt(Appoinment1 appoinmnt) {
		this.appoinmnt = appoinmnt;
	}
	public Doctor1 getD1() {
		return d1;
	}
	public void setD1(Doctor1 d1) {
		this.d1 = d1;
	}
	
	

}
