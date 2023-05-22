package com.pricing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pricing_details")
public class PricingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="category",nullable=false)
	private String Category;
	
	@Column(name="adult_price",nullable=false)
	private String adultPrice;
	
	@Column(name="child_price",nullable=false)
	private String childPrice;
	
	@OneToMany
	@JoinColumn(name="pricing_header_id")
	PricingHeader pricing_header;

	public PricingDetails(String category, String adultPrice, String childPrice, PricingHeader pricing_header) {
		super();
		Category = category;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.pricing_header = pricing_header;
	}

	public PricingDetails() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}

	public String getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(String childPrice) {
		this.childPrice = childPrice;
	}

	public PricingHeader getPricing_header() {
		return pricing_header;
	}

	public void setPricing_header(PricingHeader pricing_header) {
		this.pricing_header = pricing_header;
	}
	
	
	
}
