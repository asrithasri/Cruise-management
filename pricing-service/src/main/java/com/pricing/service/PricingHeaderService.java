package com.pricing.service;

import java.util.List;

import com.pricing.entity.PricingHeader;

public interface PricingHeaderService {
	public List<PricingHeader> findAllPricingHeaders();
	
	public PricingHeader findPricingHeaderById(Long id);
	
	public void createPricingHeader(PricingHeader pricing_header);
	
	public void updatePricingHeader(PricingHeader pricing_header);
	
	public void deletePricingHeader(Long id);
	
}
