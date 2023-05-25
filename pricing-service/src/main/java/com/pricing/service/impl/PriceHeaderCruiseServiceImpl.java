package com.pricing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pricing.entity.PriceHeaderCruise;
import com.pricing.repository.PriceHeaderCruiseRepository;
import com.pricing.service.PriceHeaderCruiseService;

import common.exception.NotFoundException;

public class PriceHeaderCruiseServiceImpl implements PriceHeaderCruiseService {
	@Autowired
	private PriceHeaderCruiseRepository priceHeaderCruiseRepository;
	
	public PriceHeaderCruiseServiceImpl(PriceHeaderCruiseRepository priceHeaderCruiseRepository) {
		this.priceHeaderCruiseRepository = priceHeaderCruiseRepository;
	}
	

	@Override
	public List<PriceHeaderCruise> findAllPriceHeaderCruise() {
		return priceHeaderCruiseRepository.findAll();
	}

	@Override
	public PriceHeaderCruise findPriceHeaderCruiseById(Long id) {
		return priceHeaderCruiseRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("PriceHeaderCruise not found with ID %d", id)));
		
	}

	@Override
	public void createPriceHeaderCruise(PriceHeaderCruise priceHeaderCruise) {
		priceHeaderCruiseRepository.save(priceHeaderCruise);
		
	}

	@Override
	public void updatePriceHeaderCruise(PriceHeaderCruise priceHeaderCruise) {
		priceHeaderCruiseRepository.save(priceHeaderCruise);
	}

	@Override
	public void deletePriceHeaderCruise(Long id) {
		final PriceHeaderCruise pricingHeaderCruise = priceHeaderCruiseRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("PricingHeaderCruise not Found with ID %d",id)));
		priceHeaderCruiseRepository.deleteById(pricingHeaderCruise.getId());
		
	}

	
}
