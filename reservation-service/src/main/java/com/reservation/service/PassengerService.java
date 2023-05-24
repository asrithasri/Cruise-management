package com.reservation.service;

import java.util.List;

import com.reservation.entity.Passenger;

public interface PassengerService {

	public List<Passenger> findAllPassengers();
	
	public Passenger findPassengerById(Long passId);
	
	public void createPassenger(Passenger passenger);
	
	public void updatePassenger(Passenger passenger);
	
	public void deletePassenger(Long passId);
}
