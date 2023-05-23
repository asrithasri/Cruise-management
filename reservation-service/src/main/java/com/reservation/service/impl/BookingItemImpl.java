package com.reservation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.BookingItem;
import com.reservation.repository.BookingItemRepository;
import com.reservation.service.BookingItemService;

@Service
public class BookingItemImpl implements BookingItemService{
	
	@Autowired
	private BookingItemRepository bookingItemRepository;

	@Override
	public List<BookingItem> findAllPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingItem findBookingItemById(Long Booking_item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBookingItem(BookingItem booking_item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookingItem(BookingItem booking_item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookingItem(Long booking_item_id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
