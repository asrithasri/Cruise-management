package com.pricing.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pricing_header")

public class PricingHeader {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pricing_header_id")
	private long id;
	
	@Column(name="start_date",nullable=false)
	private Date startDate;
	
	@Column(name="end_date",nullable=false)
	private Date endDate;
	
	@Column(name="pricing_code",nullable=false)
	private String pricingCode;
	
	@Column(name="pricing_description",nullable=false)
	private String pricingDescription;

	public PricingHeader(Date startDate, Date endDate, String pricingCode, String pricingDescription) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.pricingCode = pricingCode;
		this.pricingDescription = pricingDescription;
	}

	public PricingHeader() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPricingCode() {
		return pricingCode;
	}

	public void setPricingCode(String pricingCode) {
		this.pricingCode = pricingCode;
	}

	public String getPricingDescription() {
		return pricingDescription;
	}

	public void setPricingDescription(String pricingDescription) {
		this.pricingDescription = pricingDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
}
