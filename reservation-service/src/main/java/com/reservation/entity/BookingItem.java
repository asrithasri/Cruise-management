package com.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_item")
public class BookingItem {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_item_id")
	private Long booking_item_id;
	
	@OneToOne
	@JoinColumn(name = "booking_id")
	Booking booking;
	
	@OneToOne
	@JoinColumn(name = "pricing_details_id")
	PricingDetails pricing_details;
	
	@OneToMany
	@JoinColumn(name = "cruise_id")
	Cruise cruise;
	
	@OneToOne
	@JoinColumn(name = "category_code")
	Inventory inventory;

	public BookingItem() {
		super();
	}

	public BookingItem(Booking booking,
			PricingDetails pricing_details,
			Cruise cruise,
			Inventory inventory) {
		
		super();
		this.booking = booking;
		this.pricing_details = pricing_details;
		this.cruise = cruise;
		this.inventory = inventory;
	}

	public Long getBooking_item_id() {
		return booking_item_id;
	}

	public void setBooking_item_id(Long booking_item_id) {
		this.booking_item_id = booking_item_id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public PricingDetails getPricing_details() {
		return pricing_details;
	}

	public void setPricing_details(PricingDetails pricing_details) {
		this.pricing_details = pricing_details;
	}

	public Cruise getCruise() {
		return cruise;
	}

	public void setCruise(Cruise cruise) {
		this.cruise = cruise;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	
	
	

}
