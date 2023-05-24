package com.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_charges")
public class BookingCharges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_charges_id")
	private Long bookingChargesId;
	
	@OneToMany
	@JoinColumn(name = "booking_item_id")
	BookingItem booking_item;
	
	@OneToOne
	@JoinColumn(name = "passenger_id")
	Passenger passenger;
	
	@Column(name="price")
	private Integer price;

	public BookingCharges() {
		
		super();
	}

	public BookingCharges(BookingItem booking_item, Passenger passenger, Integer price) {
		super();
		this.booking_item = booking_item;
		this.passenger = passenger;
		this.price = price;
	}

	public Long getBookingChargesId() {
		return bookingChargesId;
	}

	public void setBookingChargesId(Long bookingChargesId) {
		this.bookingChargesId = bookingChargesId;
	}

	public BookingItem getBooking_item() {
		return booking_item;
	}

	public void setBooking_item(BookingItem booking_item) {
		this.booking_item = booking_item;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	

	
}
