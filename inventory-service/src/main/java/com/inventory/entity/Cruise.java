package com.inventory.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cruise")

public class Cruise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cruise_id")
	private long cruiseId;
	
	@OneToMany
	@JoinColumn(name="ship_id")
	Ship ship;
	
	@Column(name="ship_id")
	private long shipId;
	
	@Column(name="depature_date")
	private Date departureDate;

	@Column(name="arrival_date")
	private Date arrivalDate;
	
	public Cruise() {
		
	}

	public Cruise(Ship ship, long shipId, Date departureDate, Date arrivalDate) {
		super();
		this.ship = ship;
		this.shipId = shipId;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}

	public long getCruiseId() {
		return cruiseId;
	}

	public void setCruiseId(long cruiseId) {
		this.cruiseId = cruiseId;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public long getShipId() {
		return shipId;
	}

	public void setShipId(long shipId) {
		this.shipId = shipId;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	

}
