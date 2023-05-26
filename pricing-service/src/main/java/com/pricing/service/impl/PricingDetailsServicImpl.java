package com.pricing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

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

	@Override
	public PricingDetails updatePricingDetails(@RequestBody PricingDetails pricingDetails) {
		
		PricingDetails existingPricingDetails = pricingDetailsRepository.findById(pricingDetails.getId()).get();
		existingPricingDetails.setAdultPrice(pricingDetails.getAdultPrice());
		existingPricingDetails.setChildPrice(pricingDetails.getChildPrice());
		existingPricingDetails.setCategory(pricingDetails.getCategory());
		return pricingDetailsRepository.save(pricingDetails);
	}

	@Override
	public void deletePricingDetails(Long id) {
		final PricingDetails pricingDetails = pricingDetailsRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing Details not Found with ID %d", id)));
		pricingDetailsRepository.deleteById(pricingDetails.getId());;
		
	}

	@Override
	public PricingDetails createPricingDetails(PricingDetails pricingDetails) {
		
		return null;
	}
	
	
}
