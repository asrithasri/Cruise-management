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

	@Override
	public List<BookingCharges> findAllBookingCharges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingCharges findBookingChargesById(Long booking_charges_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBookingCharges(BookingCharges booking_charges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookingItem(BookingCharges booking_charges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookingCharges(Long booking_charges_id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
