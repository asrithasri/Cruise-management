package com.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="segment")
public class Segment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="segment_id")
	private long segmentId;
	
	@Column(name="from_port")
	private String fromPort;

	@Column(name="to_port")
	private String toPort;

	@Column(name="day")
	private long day;
	
	@OneToMany
	@JoinColumn(name="cruise_id")
	Cruise cruise;
	
	public Segment() {
		
	}

	public Segment(String fromPort, String toPort, long day, Cruise cruise) {
		super();
		this.fromPort = fromPort;
		this.toPort = toPort;
		this.day = day;
		this.cruise = cruise;
	}

	public long getSegmentId() {
		return segmentId;
	}

	public void setSegmentId(long segmentId) {
		this.segmentId = segmentId;
	}

	public String getFromPort() {
		return fromPort;
	}

	public void setFromPort(String fromPort) {
		this.fromPort = fromPort;
	}

	public String getToPort() {
		return toPort;
	}

	public void setToPort(String toPort) {
		this.toPort = toPort;
	}

	public long getDay() {
		return day;
	}

	public void setDay(long day) {
		this.day = day;
	}

	public Cruise getCruise() {
		return cruise;
	}

	public void setCruise(Cruise cruise) {
		this.cruise = cruise;
	}
	
	

}
