package com.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pay_id")
	private Long payId;
	
	@OneToOne
	@JoinColumn(name = "booking_item_id")
	Booking booking;
	
	@Column(name="total_amount")
	private Integer totalAmount;
	
	@Column(name="pay_status")
	private String payStatus;

	public Payment() {
		super();
	}

	public Payment(Booking booking,
			Integer totalAmount,
			String payStatus) {
		
		super();
		this.booking = booking;
		this.totalAmount = totalAmount;
		this.payStatus = payStatus;
	}

	public Long getPayId() {
		return payId;
	}

	public void setPayId(Long payId) {
		this.payId = payId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	
			
}
