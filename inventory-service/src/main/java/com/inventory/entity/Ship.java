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
	private long shipid;
	
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

	public long getShipid() {
		return shipid;
	}

	public void setShipid(long shipid) {
		this.shipid = shipid;
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
