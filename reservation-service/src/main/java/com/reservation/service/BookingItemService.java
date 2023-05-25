package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingItem;

public interface BookingItemService {
	
	public List<BookingItem> findAllPassengers();
	
	public BookingItem findBookingItemById(Long bookingItemId);
	
	public void createBookingItem(BookingItem bookingItem);
	
	public void updateBookingItem(BookingItem bookingItem);
	
	public void deleteBookingItem(Long bookingItemId);

}
