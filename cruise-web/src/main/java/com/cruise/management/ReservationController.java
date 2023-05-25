package com.cruise.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reservation.entity.Booking;
import com.reservation.service.BookingChargesService;
import com.reservation.service.BookingItemService;
import com.reservation.service.BookingService;
import com.reservation.service.PassengerService;
import com.reservation.service.PaymentService;

@Controller
public class ReservationController {

	@Autowired
	private final BookingService bookingService;
	private final PassengerService passengerService;
	private final BookingItemService bookingItemService;
	private final BookingChargesService bookingChargesService; 
	private final PaymentService paymentService;
	
	public ReservationController(BookingService bookingService,
			PassengerService passengerService,
			BookingItemService bookingItemService,
			BookingChargesService bookingChargesService,
			PaymentService paymentService) {
		
		super();
		
		this.bookingService = bookingService;
		this.passengerService = passengerService;
		this.bookingItemService = bookingItemService;
		this.bookingChargesService = bookingChargesService;
		this.paymentService = paymentService;
	}
	
	@RequestMapping("/booking")
	public String findAllBookings(Model model) {		
		
		final List<Booking> bookings = bookingService.findAllBookings();
		
		model.addAttribute("Bookings", bookings);
		return "list-bookings";
		
			
	}
	
	@RequestMapping("/book/{bookingId}")
	public String findBookingById(@PathVariable("bookingId")Long bookingId, Model model) {
		
		final Booking booking = bookingService.findBookingById(bookingId);
		
		model.addAttribute("booking", booking);
		return "list-booking";
	}
	
	@RequestMapping("/remove-booking{bookingId}")
	public String deleteBooking(@PathVariable("bookingId") Long bokingId, Model model) {
		bookingService.deleteBooking(bokingId);
		
		model.addAttribute("booking", bookingService.findAllBookings());
		return"redirect:/booking";
		
	}
	
}
