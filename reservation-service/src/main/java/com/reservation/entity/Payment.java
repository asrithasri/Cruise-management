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
	private Long pay_id;
	
	@OneToOne
	@JoinColumn(name = "booking_item_id")
	Booking booking;
	
	@Column(name="total_amount")
	private Integer total_amount;
	
	@Column(name="pay_status")
	private String pay_status;

	public Payment() {
		super();
	}

	public Payment(Long pay_id,
			Booking booking,
			Integer total_amount,
			String pay_status) {
		
		super();
		
		this.pay_id = pay_id;
		this.booking = booking;
		this.total_amount = total_amount;
		this.pay_status = pay_status;
	}

	public Long getPay_id() {
		return pay_id;
	}

	public void setPay_Id(Long pay_id) {
		this.pay_id = pay_id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public String getPay_status() {
		return pay_status;
	}

	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
			
}
