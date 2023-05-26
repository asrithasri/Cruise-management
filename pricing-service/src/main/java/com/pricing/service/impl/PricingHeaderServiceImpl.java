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
	public PricingHeader createPricingHeader(PricingHeader pricingHeader) {
		PricingHeader pHeader= new PricingHeader();
		pHeader.setStartDate(pricingHeader.getStartDate());
		pHeader.setEndDate(pricingHeader.getEndDate());
		pHeader.setPricingCode(pricingHeader.getPricingCode());
		pHeader.setPricingDescription(pricingHeader.getPricingDescription());
		return pricingHeaderRepository.save(pHeader);
	}

	@Override
	public PricingHeader updatePricingHeader(PricingHeader pricingHeader) {
		PricingHeader existingPricingHeader = pricingHeaderRepository.findById(pricingHeader.getId()).get();
		existingPricingHeader.setStartDate(pricingHeader.getStartDate());
		existingPricingHeader.setEndDate(pricingHeader.getEndDate());
		existingPricingHeader.setPricingCode(pricingHeader.getPricingCode());
		existingPricingHeader.setPricingDescription(pricingHeader.getPricingDescription());
		return pricingHeaderRepository.save(existingPricingHeader);
		
	}

	@Override
	public void deletePricingHeader(Long id) {
		final PricingHeader pricingHeader = pricingHeaderRepository.findById(id)
				.orElseThrow(()-> new NotFoundException(String.format("Pricing Header Not Found with ID %d",id)));
		pricingHeaderRepository.deleteById(pricingHeader.getId());		
	}

	
	
}
