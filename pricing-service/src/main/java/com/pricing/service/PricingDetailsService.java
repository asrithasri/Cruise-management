package com.pricing.service;

import java.util.List;

import com.pricing.entity.PricingDetails;


public interface PricingDetailsService {

	public List<PricingDetails> findAllPricingDetails();
	
	public PricingDetails findPricingDetailsById(Long id);
	
	public PricingDetails createPricingDetails(PricingDetails pricingDetails);
	
	public PricingDetails updatePricingDetails(PricingDetails pricingDetails);
	
	public void deletePricingDetails(Long id);

}
