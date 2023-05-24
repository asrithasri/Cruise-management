package com.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pass_id")
	private Long passId;
	
	@OneToMany
	@JoinColumn(name = "booking_id")
	Booking booking;
	
	@Column(name="passport_no")
	private Integer passportNo;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastNname;
	
	@Column(name="sex")
	private Character sex;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="phone_no")
	private Integer phoneNo;

	public Passenger() {
		super();
	}

	public Passenger(Booking booking,
			Integer passportNo,
			String firstName,
			String lastNname,
			Character sex,
			Integer age,
			String address,
			String emailId,
			Integer phoneNo) {
		
		super();
		this.booking = booking;
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastNname = lastNname;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public Long getPassId() {
		return passId;
	}

	public void setPassId(Long passId) {
		this.passId = passId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Integer getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNname() {
		return lastNname;
	}

	public void setLastNname(String lastNname) {
		this.lastNname = lastNname;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	

	
}
