package com.cruise.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reservation.entity.Booking;
import com.reservation.entity.BookingCharges;
import com.reservation.service.BookingChargesService;
import com.reservation.service.BookingItemService;
import com.reservation.service.BookingService;
import com.reservation.service.PassengerService;
import com.reservation.service.PaymentService;

@Controller
@RequestMapping("/reservation")
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
	
	@GetMapping
	public List<BookingCharges> findAllBookingCharges(){
		return bookingChargesService.findAllBookingCharges();
	}
	
	@GetMapping("/{bookingChargesId}")
	public BookingCharges findBookingChargesById(@PathVariable Long bookingChargesId) {
		return bookingChargesService.findBookingChargesById(bookingChargesId);
	}
	
//	@GetMapping("/create")
//    public String showCreateForm(Model model) {
//        model.addAttribute("bookingCharges", new BookingCharges());
//        return "create-booking-charges";
//    }

    @PostMapping("/create")
    public String createBookingCharges(BookingCharges bookingCharges) {
        bookingChargesService.createBookingCharges(bookingCharges);
        return "redirect:/booking-charges";
    }

	
	@PutMapping
	public BookingCharges updateBookingCharges(@RequestBody BookingCharges bookingCharges) {
		return bookingChargesService.updateBookingCharges(bookingCharges);
	
	}
	
	@DeleteMapping("/{bookingChargesId}")
	public void deleteBookingCharges(@PathVariable Long bookingChargesId) {
	bookingChargesService.deleteBookingCharges(bookingChargesId);
	}
	


}