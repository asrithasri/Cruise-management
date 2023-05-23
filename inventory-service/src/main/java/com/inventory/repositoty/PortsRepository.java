package com.inventory.repositoty;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Ports;


public interface PortsRepository  extends JpaRepository<Ports,Long>{

}
