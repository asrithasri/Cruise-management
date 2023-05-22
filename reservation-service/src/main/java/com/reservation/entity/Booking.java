package com.reservation.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_id")
	private Long booking_id;
	
	@Column(name="no_of_passenger")
	private Integer no_of_passenger;
	
	@Column(name="departure")
	private String departure;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="date_of_travel")
	private Date date_of_travel;
	
	@Column(name="booking_status")
	private String booking_status;
	
	@Column(name="booked_date")
	private Date booked_date;
	
	@OneToOne
	@JoinColumn(name = "pay_id")
	Payment payment;
	
	public Booking() {		
		super();		
	}

	public Booking(Integer no_of_passenger,
			String departure,
			String destination,
			Date date_of_travel,
			String booking_status,
			Date booked_date,
			Payment payment) {
		
		super();
		this.no_of_passenger = no_of_passenger;
		this.departure = departure;
		this.destination = destination;
		this.date_of_travel = date_of_travel;
		this.booking_status = booking_status;
		this.booked_date = booked_date;
		this.payment = payment;
	}

	public Long getBooking_id() {
		return booking_id;
	}

	public void setBooking_Id(Long booking_id) {
		this.booking_id = booking_id;
	}

	public Integer getNo_of_passenger() {
		return no_of_passenger;
	}

	public void setNo_of_passenger(Integer no_of_passenger) {
		this.no_of_passenger = no_of_passenger;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate_of_travel() {
		return date_of_travel;
	}

	public void setDate_of_travel(Date date_of_travel) {
		this.date_of_travel = date_of_travel;
	}

	public String getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

	public Date getBooked_date() {
		return booked_date;
	}

	public void setBooked_date(Date booked_date) {
		this.booked_date = booked_date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
			
}
