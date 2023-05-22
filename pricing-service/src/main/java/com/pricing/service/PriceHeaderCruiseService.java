package com.pricing.service;

import java.util.List;

import com.pricing.entity.PriceHeaderCruise;


public interface PriceHeaderCruiseService {
	
    public List<PriceHeaderCruise> findAllPriceHeaderCruise();
	
	public PriceHeaderCruise findPriceHeaderCruiseById(Long id);
	
	public void createPriceHeaderCruise(PriceHeaderCruise price_header_cruise);
	
	public void updatePriceHeaderCruise(PriceHeaderCruise price_header_cruise);
	
	public void deletePriceHeaderCruise(Long id);

}
