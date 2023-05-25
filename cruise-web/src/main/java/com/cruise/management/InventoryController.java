package com.cruise.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Cruise;
import com.inventory.repositoty.CruiseRepository;
import com.inventory.service.CruiseService;
import com.inventory.service.InventoryService;
import com.inventory.service.PortsService;
import com.inventory.service.SegmentService;
import com.inventory.service.ShipService;

import ch.qos.logback.core.model.Model;
@RestController
@RequestMapping()
public class InventoryController {
	@Autowired
	private final CruiseService cruiseService;
	private final InventoryService inventoryService;
	private final PortsService portsService;
	private final SegmentService segmentService;
	private final ShipService shipServicel;
	private Long cruiseId;
	
	
	public InventoryController(CruiseService cruiseService, InventoryService inventoryService,
			PortsService portsService, SegmentService segmentService, ShipService shipServicel) {
		super();
		this.cruiseService = cruiseService;
		this.inventoryService = inventoryService;
		this.portsService = portsService;
		this.segmentService = segmentService;
		this.shipServicel = shipServicel;
	}
	
	@GetMapping("/cruise")
	public List<Cruise>findAllCruise(){
		return cruiseService.findAllCruise();
	}
	
	@GetMapping("/cruise/{id}")
	public Cruise findCruiseByCruiseId(@PathVariable Long id) {
		return cruiseService.findCruiseById(cruiseId);
		
	}
	@DeleteMapping("/cruise/{id}")
	public void deleteCruise(@PathVariable Long id) {
		cruiseService.deleteCruise(cruiseId);
		
	}
	@PutMapping("/cruise")
	public Cruise updateCruise(@RequestBody Cruise cruise) {
		return cruiseService.createCruise(cruise);
		
	}
	
	

}
