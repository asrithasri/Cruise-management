package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventory.entity.Cruise;
import com.inventory.repositoty.CruiseRepository;
import com.inventory.service.CruiseService;

import common.exception.NotFoundException;


@Service

public class CruiseServiceImpl implements CruiseService{
	@Autowired
	
	private CruiseRepository cruiseRepository ;
	
	
	public CruiseServiceImpl(CruiseRepository cruiseRepository) {
		super();
		this.cruiseRepository = cruiseRepository;
	}

	@Override
	
	public List<Cruise> findAllCruise() {
		return cruiseRepository.findAll();
	}

	@Override
	public  Cruise findCruiseById(Long cruiseId) {
		return cruiseRepository.findById(cruiseId)
				.orElseThrow(() ->new NotFoundException(String.format("Cruise not found with ID %d",cruiseId)));
	}

	@Override
	public void createCruise(Cruise cruise) {
		cruiseRepository.save(cruise);
		
	}

	@Override
	public void updateCruise(Cruise cruise) {
		cruiseRepository.save(cruise);
		
	}

	@Override
	public void deleteCruise(Long cruiseId) {
		final Cruise cruise = cruiseRepository.findById(cruiseId)
				.orElseThrow(() -> new NotFoundException(String.format("Cruise not found with ID %d",cruiseId)));
		cruiseRepository.deleteById(cruise.getCruiseId());
		
	}

	@Override
	public  List<Cruise> searchCruise(String keyword) {
		if (keyword!= null) {
			return cruiseRepository.search(keyword);
			
		}
		return cruiseRepository.findAll();
		
	}

	
	
}
