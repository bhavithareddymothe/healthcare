package com.slokam.slokamprm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaints1")
public class Complaints1 {
	@Id
	@GeneratedValue
	private Long id;
	private String description;
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting1 v1;
	@ManyToMany
	@JoinTable(name="complaints1_disease1",joinColumns={@JoinColumn(name="cid1")},inverseJoinColumns={@JoinColumn(name="deid1")})
	private List<Disease1>dd1;
	@OneToMany(mappedBy="ccc",cascade=CascadeType.ALL)
	private List<Medication1>mlist;
	
	public List<Medication1> getMlist() {
		return mlist;
	}
	public void setMlist(List<Medication1> mlist) {
		this.mlist = mlist;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Visiting1 getV1() {
		return v1;
	}
	public void setV1(Visiting1 v1) {
		this.v1 = v1;
	}
	public List<Disease1> getDd1() {
		return dd1;
	}
	public void setDd1(List<Disease1> dd1) {
		this.dd1 = dd1;
	}
	
	

}
