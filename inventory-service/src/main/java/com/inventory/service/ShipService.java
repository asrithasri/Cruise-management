package com.inventory.service;

import java.util.List;

import com.inventory.entity.Ship;


public interface ShipService {
	
public List<Ship> findAllShip();
	
	public Ship findShipById(Long shipId);
	
	public void createShip(Ship ship);
	
	public void updateShip(Ship ship);
	
	public void deleteShip(Long shipId);


}
