package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingCharges;

public interface BookingChargesService {
	
	public List<BookingCharges> findAllBookingCharges();
	public BookingCharges findBookingChargesById(Long booking_charges_id);
	public void createBookingCharges(BookingCharges booking_charges);
	public void updateBookingItem(BookingCharges booking_charges);
	public void deleteBookingCharges(Long booking_charges_id);

}
