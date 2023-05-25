package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Segment;
import com.inventory.entity.Ship;
import com.inventory.repositoty.ShipRepository;
import com.inventory.service.ShipService;

import common.exception.NotFoundException;
@Service
public class ShipServiceImpl implements ShipService{
	
	private ShipRepository shipRepository;
	
	public ShipServiceImpl(ShipRepository shipRepository) {
		super();
		this.shipRepository = shipRepository;
	}
	
	
	@Override
	public List<Ship> findAllShip() {
		return shipRepository.findAll();

	}

	@Override
	public Ship findShipById(Long shipId) {
		return shipRepository.findById(shipId)
				.orElseThrow(() ->new NotFoundException(String.format("ship not found with ID %d",shipId)));
	}

	@Override
	public Ship createShip(Ship ship) {
		return shipRepository.save(ship);
		
	}

	@Override
	public Ship updateShip(Ship ship) {
		return shipRepository.save(ship);
		
	}

	@Override
	public void deleteShip(Long shipId) {
		final Ship ship = shipRepository.findById(shipId)
				.orElseThrow(() -> new NotFoundException(String.format("Ship not found with ID %d",shipId)));
		shipRepository.deleteById(ship.getShipId());
		
		
	}
	

}
