package com.slokam.slokamprm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Medicine1ControllerInsert {
	@Autowired
	private Medicine1DaoInsert dao;
	@RequestMapping("saveMedicine")
	public void saveMedicine(@RequestBody List<Medicine1> m){
		dao.saveAll(m);
	}

}
