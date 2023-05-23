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
	private Long bookingId;
	
	@Column(name="no_of_passenger")
	private Integer noOfPassenger;
	
	@Column(name="departure")
	private String departure;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="date_of_travel")
	private Date dateOfTravel;
	
	@Column(name="booking_status")
	private String bookingStatus;
	
	@Column(name="booked_date")
	private Date bookedDate;
	
	@OneToOne
	@JoinColumn(name = "pay_id")
	Payment payment;
	
	public Booking() {		
		super();		
	}

	public Booking(Integer noOfPassenger,
			String departure,
			String destination, 
			Date dateOfTravel,
			String bookingStatus,
			Date bookedDate,
			Payment payment) {
		
		super();
		this.noOfPassenger = noOfPassenger;
		this.departure = departure;
		this.destination = destination;
		this.dateOfTravel = dateOfTravel;
		this.bookingStatus = bookingStatus;
		this.bookedDate = bookedDate;
		this.payment = payment;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(Integer noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
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

	public Date getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

				
}
