package com.pricing.service;

import java.util.List;

import com.pricing.entity.PricingHeader;


public interface PricingHeaderService {
	public List<PricingHeader> findAllPricingHeaders();
	
	public PricingHeader findPricingHeaderById(Long pricingHeaderId);
	
	public PricingHeader createPricingHeader(PricingHeader pricingHeader);
	
	public PricingHeader updatePricingHeader(PricingHeader pricingHeader);
	
	public void deletePricingHeader(Long pricingHeaderId);
	
}
