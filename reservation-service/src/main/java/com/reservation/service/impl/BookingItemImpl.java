package com.reservation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.BookingItem;
import com.reservation.repository.BookingItemRepository;
import com.reservation.service.BookingItemService;

import common.exception.NotFoundException;

@Service
public class BookingItemImpl implements BookingItemService{
	
	@Autowired
	private BookingItemRepository bookingItemRepository;
	
	public BookingItemImpl(BookingItemRepository bookingItemRepository) {
		super();
		this.bookingItemRepository = bookingItemRepository;
	}

	@Override
	public List<BookingItem> findAllBookingItem() {
		return bookingItemRepository.findAll();
	}

	@Override
	public BookingItem findBookingItemById(Long bookingItemId) {		
		return bookingItemRepository.findById(bookingItemId)
				.orElseThrow(()-> new NotFoundException(String.format("Booking item not found with ID %d",bookingItemId)));
	}

	@Override
	public void deleteBookingItem(Long bookingItemId) {
		final BookingItem bookingItem = bookingItemRepository.findById(bookingItemId)
				.orElseThrow(()-> new NotFoundException(String.format("Booking item not found with ID %d",bookingItemId)));
		
	}

	
}
