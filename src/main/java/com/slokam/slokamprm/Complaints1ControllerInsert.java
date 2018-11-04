package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Complaints1ControllerInsert {
	@Autowired
	private Complaints1DaoInsert dao;
	@RequestMapping("savecomplaints")
	public void saveMedication(@RequestBody Complaints1 c){
		List<Medication1> mlist1=c.getMlist();
		for (Medication1 me : mlist1) {
			me.setCcc(c);
			
		}
		dao.save(c);
	}
	

}
