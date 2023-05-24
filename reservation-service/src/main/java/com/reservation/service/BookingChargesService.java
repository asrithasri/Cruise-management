package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingCharges;

public interface BookingChargesService {
	
	public List<BookingCharges> findAllBookingCharges();
	
	public BookingCharges findBookingChargesById(Long bookingChargesId);
	
	public void createBookingCharges(BookingCharges bookingCharges);
	
	public void updateBookingCharges(BookingCharges bookingCharges);
	
	public void deleteBookingCharges(Long bookingChargesId);

}
