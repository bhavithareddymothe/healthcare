package com.slokam.slokamprm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication1")
public class Medication1 {
	@Id
	@GeneratedValue
	private Long id;
	private String howtoUse;
	private Integer quantity;
	private Integer duration;
	@ManyToOne
	@JoinColumn(name="mid1")
	private Medicine1 mm1;
	@ManyToOne
	@JoinColumn(name="cid11")
	private Complaints1 ccc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHowtoUse() {
		return howtoUse;
	}
	public void setHowtoUse(String howtoUse) {
		this.howtoUse = howtoUse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Medicine1 getMm1() {
		return mm1;
	}
	public void setMm1(Medicine1 mm1) {
		this.mm1 = mm1;
	}
	public Complaints1 getCcc() {
		return ccc;
	}
	public void setCcc(Complaints1 ccc) {
		this.ccc = ccc;
	}
	

}
