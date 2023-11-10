package com.diaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.diaStore.entity.Diagonstic;
import com.diaStore.entity.MyTestList;
import com.diaStore.service.MyTestListService;
import com.diaStore.service.TestService;

@Controller
public class DiagonsticController {
   
	@Autowired
	
	private TestService service;
	
	@Autowired
	private MyTestListService myTestService;
	@GetMapping("/")
	public String home () {
		return "home";
	}
	@GetMapping("/test_register")
	public String testRegister() {
		return "testRegister";
	}
	@GetMapping("/available_tests")
	public ModelAndView getAllTest() {
		List<Diagonstic> list=service.getAllTest();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("testList");
//		m.addObject("test",list);
		return new ModelAndView("testList","test",list);
		
	}
	
	@PostMapping("/save")
	public String addTest(@ModelAttribute Diagonstic d) {
		service.save(d);
		return "redirect:/available_tests";
	}
	@GetMapping("/my_tests")
	public String getMyTests(Model model) {
		List<MyTestList>list=myTestService.getAllMyTests();
		model.addAttribute("test",list);
		return "myTests";
	}
	@RequestMapping("/myList/{id}")
	public String getMyList(@PathVariable("id")int id) {
		Diagonstic d=service.getTestById(id);
		MyTestList mb=new MyTestList(d.getId(),d.getTestname(),d.getDoctorname(),d.getPrice());
	
		myTestService.saveMyTests(mb);
		return "redirect:/my_tests";
	}
	@RequestMapping("/editTest/{id}")
	public String editTest(@PathVariable("id") int id,Model model) {
		Diagonstic d=service.getTestById(id);
		model.addAttribute("test",d);
		return "TestEdit";
	}
	
	@RequestMapping("/deleteTest/{id}")
	public String deleteTest(@PathVariable("id")int id)  {
		service.deleteByid(id);
		return "redirect:/available_tests";
	}
}
