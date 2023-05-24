package com.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.BookingCharges;
import com.reservation.repository.BookingChargesRepository;
import com.reservation.service.BookingChargesService;

@Service
public class BookingChargesImpl implements BookingChargesService {
	
	@Autowired 
	private BookingChargesRepository bookingChargesRepository;
	
	public BookingChargesImpl(BookingChargesRepository bookingChargesRepository) {
		super();
		this.bookingChargesRepository = bookingChargesRepository;
	}

	@Override
	public List<BookingCharges> findAllBookingCharges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingCharges findBookingChargesById(Long bookingChargesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBookingCharges(BookingCharges bookingCharges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookingCharges(BookingCharges bookingCharges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookingCharges(Long bookingChargesId) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
