package com.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.Passenger;
import com.reservation.repository.PassengerRepository;
import com.reservation.service.PassengerService;

@Service
public class PassengerImpl implements PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public List<Passenger> findAllPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger findPassengerById(Long pass_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePassenger(Long pass_id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
