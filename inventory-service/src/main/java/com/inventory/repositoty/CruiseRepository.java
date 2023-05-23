package com.inventory.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Cruise;

public interface CruiseRepository extends JpaRepository<Cruise,Long> {

}
