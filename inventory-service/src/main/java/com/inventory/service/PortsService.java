package com.inventory.service;

import java.util.List;

import com.inventory.entity.Ports;

public interface PortsService {
	
	public List<Ports> findAllPorts();
	
	public Ports findPortsById(Long portsId);
	
	public void createPorts(Ports ports);
	
	public void updatePorts(Ports ports);
	
	public void deletePorts(Long portsId);
	

}
