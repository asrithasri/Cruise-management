package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Inventory;
import com.inventory.repositoty.InventoryRepository;
import com.inventory.service.InventoryService;

import common.exception.NotFoundException;
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
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory findInventoryById(Long inventoryId) {
		return inventoryRepository.findById(inventoryId)
		.orElseThrow(()-> new NotFoundException(String.format("Inventory not found with ID %d",inventoryId)));	}
	
	@Override
	public void createInventory(Inventory inventory) {
		inventoryRepository.save(inventory);
		
	}

	@Override
	public void updateInventory(Inventory inventory) {
		inventoryRepository.save(inventory);
		
		
	}
	@Override
	public void deleteInventory(Long inventoryId) {
		final Inventory inventory=inventoryRepository.findById(inventoryId)
				.orElseThrow(()->new NotFoundException(String.format("Inventory not found with ID %d",inventoryId)));
		inventoryRepository.deleteById(inventory.getInventoryId());
		
	}



}
