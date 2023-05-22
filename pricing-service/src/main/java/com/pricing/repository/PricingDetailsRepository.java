package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pricing.entity.PricingDetails;

public interface PricingDetailsRepository extends JpaRepository<PricingDetails,Long> {

}
