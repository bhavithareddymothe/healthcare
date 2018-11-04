package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patient1ControllerInsert {
	@Autowired
	private  Patient1DaoInsert dao;
	@RequestMapping("savePatient")
	public void savePatient(@RequestBody List<Patient1>p){
		dao.saveAll(p);
	}
	/*@RequestMapping("byMedicine/{medicineName}")
		 public List<Object[]> getPatientByMedicine(@PathVariable("medicineName") String medicineName){
			 return dao.getPatientByMedicine(medicineName);
		 }*/
	@RequestMapping("/byDisease/{diseaseName}")
	public List<Object[]> getPatientByDisease(@PathVariable("diseaseName")String diseaseName){
		return dao.getPatientByDisease(diseaseName);
	}
	}


