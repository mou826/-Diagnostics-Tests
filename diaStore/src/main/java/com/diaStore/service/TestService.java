package com.diaStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaStore.entity.Diagonstic;
import com.diaStore.repository.DiaRepository;

@Service
public class TestService {
	
	@Autowired
	private DiaRepository dRepo;
	
	public void save(Diagonstic d ) {
		dRepo.save(d);
	}
	public List<Diagonstic> getAllTest() {
		return dRepo.findAll();
	}
	public Diagonstic getTestById(int id) {
		return dRepo.findById(id).get();
	}
	public void deleteByid(int id) {
		dRepo.deleteById(id);
	}

}
