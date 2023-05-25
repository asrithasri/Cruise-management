package com.reservation.service;

import java.util.List;

import com.reservation.entity.Passenger;

public interface PassengerService {

	public List<Passenger> findAllPassengers();
	
	public Passenger findPassengerById(Long passId);
	
	public Passenger createPassenger(Passenger passenger);
	
	public Passenger updatePassenger(Passenger passenger);
	
	public void deletePassenger(Long passId);
	
	public Passenger save (Passenger passenger);
}
