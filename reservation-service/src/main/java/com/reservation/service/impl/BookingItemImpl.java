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
	
	public BookingItemImpl(BookingItemRepository bookingItemRepository) {
		super();
		this.bookingItemRepository = bookingItemRepository;
	}

	@Override
	public List<BookingItem> findAllPassengers() {
		return bookingItemRepository.findAll();;
	}

	@Override
	public BookingItem findBookingItemById(Long BookingItemId) {		
		return bookingItemRepository.findById(BookingItemId)
				.orElseThrow(()-> new NotFoundException(String.format("Booking item not found with ID %d",bookingItemId)));
	}

	@Override
	public void createBookingItem(BookingItem bookingItem) {
		bookingItemRepository.save(bookingItem);
		
	}

	@Override
	public void updateBookingItem(BookingItem bookingItem) {
		bookingItemRepository.save(bookingItem);
		
	}

	@Override
	public void deleteBookingItem(Long bookingItemId) {
		final BookingItem bookingItem = bookingItemRepository.findById(bookingItemId)
				.orElseThrow(()-> new NotFoundException(String.format("Booking item not found with ID %d",bookingItemId)));
		
	}

	
}
