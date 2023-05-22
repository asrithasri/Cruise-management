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
	private Long pass_id;
	
	@OneToMany
	@JoinColumn(name = "booking_id")
	Booking booking;
	
	@Column(name="passport_no")
	private Integer passport_no;
	
	@Column(name="f_name")
	private String f_name;
	
	@Column(name="l_name")
	private String l_name;
	
	@Column(name="sex")
	private Character sex;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="e_mail")
	private String e_mail;
	
	@Column(name="phone_no")
	private Integer phone_no;

	public Passenger() {
		super();
	}

	public Passenger(Booking booking,
			Integer passport_no,
			String f_name,
			String l_name,
			Character sex,
			Integer age,
			String address, String e_mail, Integer phone_no) {
		
		super();
		this.booking = booking;
		this.passport_no = passport_no;
		this.f_name = f_name;
		this.l_name = l_name;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.e_mail = e_mail;
		this.phone_no = phone_no;
	}

	public Long getPass_id() {
		return pass_id;
	}

	public void setPass_id(Long pass_id) {
		this.pass_id = pass_id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Integer getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(Integer passport_no) {
		this.passport_no = passport_no;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
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

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public Integer getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}

	
}
