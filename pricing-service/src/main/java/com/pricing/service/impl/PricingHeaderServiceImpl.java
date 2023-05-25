package com.pricing.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.entity.PricingHeader;
import com.pricing.repository.PricingHeaderRepository;
import com.pricing.service.PricingHeaderService;

import common.exception.NotFoundException;



@Service
public class PricingHeaderServiceImpl implements PricingHeaderService{
	@Autowired
	private PricingHeaderRepository pricingHeaderRepository;

	@Override
	public List<PricingHeader> findAllPricingHeaders() {
		return pricingHeaderRepository.findAll();
	}

	@Override
	public PricingHeader findPricingHeaderById(Long id) {
		return pricingHeaderRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing Header not found with ID %d",id)));
	}

	@Override
	public void createPricingHeader(PricingHeader pricingHeader) {
		pricingHeaderRepository.save(pricingHeader);
	}

	@Override
	public void updatePricingHeader(PricingHeader pricingHeader) {
		pricingHeaderRepository.save(pricingHeader);
		
	}

	@Override
	public void deletePricingHeader(Long id) {
		final PricingHeader pricingHeader = pricingHeaderRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing Header Not Found with ID %d",id)));
		pricingHeaderRepository.deleteById(pricingHeader.getId());		
	}

	
	
}
