package com.slokam.slokamprm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine1")
public class Medicine1 {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description11;
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
	public String getDescription11() {
		return description11;
	}
	public void setDescription11(String description11) {
		this.description11 = description11;
	}
	
	
	
	

}
