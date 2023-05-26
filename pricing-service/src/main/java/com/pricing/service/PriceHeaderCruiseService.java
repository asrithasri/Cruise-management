package com.pricing.service;

import java.util.List;

import com.pricing.entity.PriceHeaderCruise;


public interface PriceHeaderCruiseService {
	
    public List<PriceHeaderCruise> findAllPriceHeaderCruise();
	
	public PriceHeaderCruise findPriceHeaderCruiseById(Long id);
	
}
