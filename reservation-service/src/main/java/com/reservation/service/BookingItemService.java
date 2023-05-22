package com.reservation.service;

import java.util.List;

import com.reservation.entity.BookingItem;

public interface BookingItemService {
	
	public List<BookingItem> findAllPassengers();
	public BookingItem findBookingItemById(Long Booking_item_id);
	public void createBookingItem(BookingItem booking_item);
	public void updateBookingItem(BookingItem booking_item);
	public void deleteBookingItem(Long booking_item_id);

}
