package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pricing.entity.PricingHeader;

public interface PricingHeaderRepository extends JpaRepository<PricingHeader,Long>{

}
