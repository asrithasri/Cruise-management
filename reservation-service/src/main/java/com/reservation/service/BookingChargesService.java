package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingCharges;

public interface BookingChargesService {
	
	public List<BookingCharges> findAllBookingCharges();
	
	public BookingCharges findBookingChargesById(Long bookingChargesId);
	
	public BookingCharges createBookingCharges(BookingCharges bookingCharges);
	
	public BookingCharges updateBookingCharges(BookingCharges bookingCharges);
	
	public void deleteBookingCharges(Long bookingChargesId);

}
