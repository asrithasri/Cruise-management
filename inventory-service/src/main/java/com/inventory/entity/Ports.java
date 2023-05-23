package com.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ports")

public class Ports {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="port_id")
	private long portid;
	
	@Column(name="port_code")
	private String portCode;
	
	@Column(name="unlo_code")
	private String unloCode;
	
	@Column(name="port_manager")
	private String portManager;
	
	public Ports(){

}

	public Ports(String portCode, String unloCode, String portManager) {
		super();
		this.portCode = portCode;
		this.unloCode = unloCode;
		this.portManager = portManager;
	}

	public long getPortid() {
		return portid;
	}

	public void setPortid(long portid) {
		this.portid = portid;
	}

	public String getPortCode() {
		return portCode;
	}

	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}

	public String getUnloCode() {
		return unloCode;
	}

	public void setUnloCode(String unloCode) {
		this.unloCode = unloCode;
	}

	public String getPortManager() {
		return portManager;
	}

	public void setPortManager(String portManager) {
		this.portManager = portManager;
	}
	
	
}
