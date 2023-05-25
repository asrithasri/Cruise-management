package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingItem;

public interface BookingItemService {
	
	public List<BookingItem> findAllBookingItem();
	
	public BookingItem findBookingItemById(Long bookingItemId);
	
	public void deleteBookingItem(Long bookingItemId);

}
