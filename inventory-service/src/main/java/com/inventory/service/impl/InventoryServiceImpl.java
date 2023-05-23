package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Inventory;
import com.inventory.repositoty.InventoryRepository;
import com.inventory.service.InventoryService;
@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private  InventoryRepository inventoryRepository;
	

	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
	}

	@Override
	public List<Inventory> findAllInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory findInventoryById(Long inventoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createInventory(Inventory inventory) {
		
		
	}

	@Override
	public void updateInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInventory(Long inventoryId) {
		// TODO Auto-generated method stub
		
	}



}
