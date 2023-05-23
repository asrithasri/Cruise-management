package com.inventory.service;

import java.util.List;

import com.inventory.entity.Inventory;

public interface InventoryService {
	

	public List<Inventory> findAllInventory();
	
	public Inventory findInventoryById(Long id);
	
	public void createInventory(Inventory inventory);
	
	public void updateInventory(Inventory inventory);
	
	public void deleteInventory(Long id);
	

}
