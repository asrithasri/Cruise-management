package com.pricing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pricing.entity.PricingDetails;
import com.pricing.repository.PricingDetailsRepository;
import com.pricing.service.PricingDetailsService;

import common.exception.NotFoundException;

public class PricingDetailsServicImpl implements PricingDetailsService {
	
	@Autowired
	private  PricingDetailsRepository pricingDetailsRepository;

	public PricingDetailsServicImpl(PricingDetailsRepository pricingDetails) {
		super();
		this.pricingDetailsRepository = pricingDetails;
	}

	@Override
	public List<PricingDetails> findAllPricingDetails() {
		return pricingDetailsRepository.findAll();
	}

	@Override
	public PricingDetails findPricingDetailsById(Long id) {
		return pricingDetailsRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing details Not found with ID %d", id)));
	}

	// check name pricing_details 
	@Override
	public void createPricingDetails(PricingDetails pricing_details) {
		pricingDetailsRepository.save(pricing_details);
		
	}

	@Override
	public void updatePricingDetails(PricingDetails pricing_details) {
		pricingDetailsRepository.save(pricing_details);
	}

	@Override
	public void deletePricingDetails(Long id) {
		final PricingDetails pricingDetails = pricingDetailsRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing Details not Found with ID %d", id)));
		pricingDetailsRepository.deleteById(pricingDetails.getId());;
		
	}
	
	
	
}
