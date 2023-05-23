package com.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="inventory_id")
	private long inventoryId;
	
	@OneToMany
	@JoinColumn(name="segment_id")
	Segment segment;
	
	@Column(name="category_code")
	private String categoryCode;
	

	@Column(name="cabins")
	private long cabins;
	
	public Inventory() {
		
	}

	public Inventory(Segment segment, String categoryCode, long cabins) {
		super();
		this.segment = segment;
		this.categoryCode = categoryCode;
		this.cabins = cabins;
	}

	public long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Segment getSegment() {
		return segment;
	}

	public void setSegment(Segment segment) {
		this.segment = segment;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public long getCabins() {
		return cabins;
	}

	public void setCabins(long cabins) {
		this.cabins = cabins;
	}
	
	

}
