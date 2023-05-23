package com.inventory.service.impl;

import org.springframework.stereotype.Service;

import com.inventory.repositoty.CruiseRepository;
import com.inventory.service.CruiseService;



@Service
public class CruiseServiceImpl implements CruiseService{
	private final CruiseRepository cruiseRepository;
	
	public CruiseServiceImpl(CruiseServiceRepository cruiseRepository) {
		super();
		this.cruiseRepository = cruiseRepository;
		}
	
	public List<Cruise> getAllStudents(){
		return CruiseRepository.findAll();
	}
	
	public Cruise saveCruise(Cruise cruise) {
		return CruiseRepository.save(cruise);
	}
	
	

}
