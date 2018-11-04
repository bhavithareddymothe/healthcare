package com.slokam.slokamprm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient1")
public class Patient1 {
	@Id
	@GeneratedValue
	private Long id;
	private String name; 
	private Date dob;
	private Long mobilenum;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(Long mobilenum) {
		this.mobilenum = mobilenum;
	}
	
	

}
