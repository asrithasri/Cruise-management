package com.inventory.service;

import java.util.List;

import com.inventory.entity.Cruise;

public interface CruiseService {
	

	public List<Cruise> findAllCruise();
	
	public Cruise findCruiseById(Long id);
	
	public void createCruise(Cruise cruise);
	
	public void updateCruise(Cruise cruise);
	
	public void deleteCruise(Long id);

}
