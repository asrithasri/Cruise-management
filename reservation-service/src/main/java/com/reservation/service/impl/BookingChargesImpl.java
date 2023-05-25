package com.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.BookingCharges;
import com.reservation.repository.BookingChargesRepository;
import com.reservation.service.BookingChargesService;

import common.exception.NotFoundException;

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
		return bookingChargesRepository.findAll();
	}

	@Override
	public BookingCharges findBookingChargesById(Long bookingChargesId) {
		return bookingChargesRepository.findById(bookingChargesId)
				.orElseThrow(() -> new NotFoundException(String.format("Booking Charges not found with ID %d",bookingChargesId)));
	}

	@Override
	public BookingCharges createBookingCharges(BookingCharges bookingCharges) {
		return bookingChargesRepository.save(bookingCharges);
		
	}

	@Override
	public BookingCharges updateBookingCharges(BookingCharges bookingCharges) {
		BookingCharges exsistingBookingCharges = bookingChargesRepository.findById(bookingCharges.getBookingChargesId()).get();
		exsistingBookingCharges.setPrice(bookingCharges.getPrice());
		return bookingChargesRepository.save(exsistingBookingCharges);
		
	}

	@Override
	public void deleteBookingCharges(Long bookingChargesId) {
		final BookingCharges bookingCharges = bookingChargesRepository.findById(bookingChargesId)
				.orElseThrow(() -> new NotFoundException(String.format("Booking Charges not found with ID %d",bookingChargesId)));
		
		bookingChargesRepository.deleteById(bookingCharges.getBookingChargesId());
	}

	
	
	
}
