package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitingControllerInsert {
	@Autowired
	private VisitingDaoInsert dao;
	@RequestMapping("savevisiting")
	public void saveAllvisiting(@RequestBody Visiting1 v){
		dao.save(v);
	}

}
