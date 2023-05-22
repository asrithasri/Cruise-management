package com.pricing.service;

import java.util.List;

import com.pricing.entity.PricingDetails;


public interface PricingDetailsService {

	public List<PricingDetails> findAllPricingDetails();
	
	public PricingDetails findPricingDetailsById(Long id);
	
	public void createPricingDetails(PricingDetails pricing_details);
	
	public void updatePricingDetails(PricingDetails pricing_details);
	
	public void deletePricingDetails(Long id);

}
