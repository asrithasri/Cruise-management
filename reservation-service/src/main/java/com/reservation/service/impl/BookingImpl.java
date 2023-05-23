package com.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.Booking;
import com.reservation.repository.BookingRepository;
import com.reservation.service.BookingService;

@Service
public class BookingImpl implements BookingService{
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public List<Booking> findAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking findBookingById(Long booking_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBooking(Long booking_id) {
		// TODO Auto-generated method stub
		
	}

	

	
}