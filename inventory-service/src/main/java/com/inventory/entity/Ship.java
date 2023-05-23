package com.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ship")

public class Ship {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ship_id")
	private long shipId;
	
	@Column(name="ship_name")
	private String shipName;
	
	@Column(name="capacity")
	private String capacity;
	
	public Ship() {
		
	}

	public Ship(String shipName, String capacity) {
		super();
		this.shipName = shipName;
		this.capacity = capacity;
	}

	public long getShipId() {
		return shipId;
	}

	public void setShipId(long shipId) {
		this.shipId = shipId;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	

}
