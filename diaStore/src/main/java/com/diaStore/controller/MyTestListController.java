package com.diaStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diaStore.service.MyTestListService;

@Controller
public class MyTestListController {
	
	@Autowired
	private MyTestListService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList (@PathVariable("id") int id) {
		service.deleteBYId(id);
		return"redirect:/my_tests";
	}

}
