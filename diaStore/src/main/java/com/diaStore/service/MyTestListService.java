package com.diaStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaStore.entity.MyTestList;
import com.diaStore.repository.MyTestRpository;

@Service
public class MyTestListService {
	
	
	@Autowired
	private MyTestRpository mytest;
	
	public void saveMyTests(MyTestList test) {
		mytest.save(test);
		
	}
	public List<MyTestList> getAllMyTests(){
		return mytest.findAll();
		
	}
	public void deleteBYId(int id) {
		mytest.deleteById(id);
	}
	

}
