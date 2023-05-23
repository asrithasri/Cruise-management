package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Ship;
import com.inventory.repositoty.ShipRepository;
import com.inventory.service.ShipService;
@Service
public class ShipServiceImpl implements ShipService{
	
	private ShipRepository shipRepository;
	
	public ShipServiceImpl(ShipRepository shipRepository) {
		super();
		this.shipRepository = shipRepository;
	}
	
	
	@Override
	public List<Ship> findAllShip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ship findShipById(Long shipId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createShip(Ship ship) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShip(Ship ship) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShip(Long shipId) {
		// TODO Auto-generated method stub
		
	}
	

}
