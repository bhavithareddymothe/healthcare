package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Doctor1ControllerInsert {
	@Autowired
	private Doctor1DaoInsert dao;
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody List<Doctor1> d){
		dao.saveAll(d);
		
	}
	

}
