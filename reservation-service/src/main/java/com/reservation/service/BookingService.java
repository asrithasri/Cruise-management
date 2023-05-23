package com.reservation.service;

import java.util.List;

import com.reservation.entity.Booking;

public interface BookingService {

	public List<Booking> findAllBookings();
	
	public Booking  findBookingById(Long bookingId);
	
	public void createBooking(Booking booking);
	
	public void updateBooking(Booking booking);
	
	public void deleteBooking(Long bookingId);
}
