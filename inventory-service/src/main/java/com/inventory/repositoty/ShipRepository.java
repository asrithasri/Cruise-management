package com.inventory.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Ship;

public interface ShipRepository extends JpaRepository<Ship,Long>{

}
