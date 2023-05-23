package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.repositoty.PortsRepository;

import com.inventory.service.PortsService;

@Service
public class PortsServiceImpl implements PortsService{
	
	@Autowired
	private PortsRepository portsRepository;
	
	

	public PortsServiceImpl(PortsRepository portsRepository) {
		super();
		this.portsRepository = portsRepository;
	}

	@Override
	public List<com.inventory.entity.Ports> findAllPorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.inventory.entity.Ports findPortsById(Long portsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPorts(com.inventory.entity.Ports ports) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePorts(com.inventory.entity.Ports ports) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePorts(Long portsId) {
		// TODO Auto-generated method stub
		
	}

	

}
