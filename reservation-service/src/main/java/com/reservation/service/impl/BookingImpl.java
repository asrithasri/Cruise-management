package com.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.Booking;
import com.reservation.repository.BookingRepository;
import com.reservation.service.BookingService;

import common.exception.NotFoundException;

@Service
public class BookingImpl implements BookingService{
	@Autowired
	private BookingRepository bookingRepository;
		
	public BookingImpl(BookingRepository bookingRepository) {
		super();
		this.bookingRepository = bookingRepository;
	}

	@Override
	public List<Booking> findAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking findBookingById(Long bookingId) {
		
		return bookingRepository.findById(bookingId)
				.orElseThrow(() -> new NotFoundException(String.format("Booking not found with ID %d", bookingId)));
	}

	@Override
	public void createBooking(Booking booking) {
		bookingRepository.save(booking);
		
	}

	@Override
	public void updateBooking(Booking booking) {
		bookingRepository.save(booking);
		
	}

	@Override
	public void deleteBooking(Long bookingId) {
		final Booking booking = bookingRepository.findById(bookingId)
				.orElseThrow(() -> new NotFoundException(String.format("Authornnot found with ID %d", bookingId)));
		
		bookingRepository.deleteById(booking.getBookingId());
	}

	
}