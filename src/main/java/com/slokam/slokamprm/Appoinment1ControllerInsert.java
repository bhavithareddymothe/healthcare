package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appoinment1ControllerInsert {
	@Autowired
	private Appoinment1DaoInsert dao;
	@RequestMapping("Appoinment1")
	public void saveallappoinment(@RequestBody List<Appoinment1>a){
		dao.saveAll(a);
	}

}
