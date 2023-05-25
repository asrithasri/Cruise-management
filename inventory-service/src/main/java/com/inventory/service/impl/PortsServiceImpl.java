package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Inventory;
import com.inventory.entity.Ports;
import com.inventory.repositoty.PortsRepository;

import com.inventory.service.PortsService;

import common.exception.NotFoundException;

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
		return portsRepository.findAll();
	}

	@Override
	public com.inventory.entity.Ports findPortsById(Long portsId) {
		return portsRepository.findById(portsId)
				.orElseThrow(() ->new NotFoundException(String.format("ports not found with ID %d",portsId)));
	}

	@Override
	public void createPorts(com.inventory.entity.Ports ports) {
		portsRepository.save(ports);
		
	}

	@Override
	public void updatePorts(com.inventory.entity.Ports ports) {
		portsRepository.save(ports);
	}

	@Override
	public void deletePorts(Long portsId) {
		final Ports ports=portsRepository.findById(portsId)
				.orElseThrow(()->new NotFoundException(String.format("ports not found with ID %d",portsId)));
		portsRepository.deleteById(ports.getPortId());
		
		
	}

	

}
