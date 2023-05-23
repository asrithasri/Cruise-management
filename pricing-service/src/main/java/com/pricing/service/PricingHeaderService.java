package com.pricing.service;

import java.util.List;

import com.pricing.entity.PricingHeader;


public interface PricingHeaderService {
	public List<PricingHeader> findAllPricingHeaders();
	
	public PricingHeader findPricingHeaderById(Long pricingHeaderId);
	
	public void createPricingHeader(PricingHeader pricingHeader);
	
	public void updatePricingHeader(PricingHeader pricingHeader);
	
	public void deletePricingHeader(Long pricingHeaderId);
	
}
