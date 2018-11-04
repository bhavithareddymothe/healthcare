package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseControllerInsert {
	@Autowired
	private DiseaseDaoInsert dao;
	@RequestMapping("saveDisease")
	public void saveDisease(@RequestBody List<Disease1> d){
		dao.saveAll(d);
		
	}

}
