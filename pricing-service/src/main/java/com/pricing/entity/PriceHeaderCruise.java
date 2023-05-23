package com.pricing.entity;

import com.inventory.entity.Cruise;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="price_header_cruise")

public class PriceHeaderCruise {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany
	@JoinColumn(name="price_header_id")
	PricingHeader pricing_header;
	
	@OneToOne
	@JoinColumn(name="cruise_id")
	Cruise cruiseId;

	public PriceHeaderCruise(PricingHeader pricing_header, Cruise cruiseId) {
		super();
		this.pricing_header = pricing_header;
		this.cruiseId = cruiseId;
	}

	public PriceHeaderCruise() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PricingHeader getPricing_header() {
		return pricing_header;
	}

	public void setPricing_header(PricingHeader pricing_header) {
		this.pricing_header = pricing_header;
	}

	public Cruise getCruiseId() {
		return cruiseId;
	}

	public void setCruiseId(Cruise cruiseId) {
		this.cruiseId = cruiseId;
	}
	
	
	
}
