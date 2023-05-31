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
import com.reservation.entity.BookingItem;
import com.reservation.entity.Passenger;
import com.reservation.service.BookingChargesService;
import com.reservation.service.BookingItemService;
import com.reservation.service.BookingService;
import com.reservation.service.PassengerService;
import com.reservation.service.PaymentService;

import common.exception.NotFoundException;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private final BookingService bookingService;
	@Autowired
	private final PassengerService passengerService;
	@Autowired
	private final BookingItemService bookingItemService;
	@Autowired
	private final BookingChargesService bookingChargesService; 
	@Autowired
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
	
	
	@GetMapping("/bookings")
	public List<Booking> getAllBookings() {
		return bookingService.findAllBookings();
	}

	@GetMapping("/bookings/{bookingId}")
	public Booking getBookingById(@PathVariable Long bookingId) {
		return bookingService.findBookingById(bookingId);
	}

	@PostMapping("/bookings")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
	}

	@PostMapping("/bookings/{bookingId}")
	public Booking updateBooking(@PathVariable Long bookingId, @RequestBody Booking booking) {
		return bookingService.updateBooking(booking);
	}

	@PostMapping("/bookings/{bookingId}")
	public void deleteBooking(@PathVariable Long bookingId) {
		bookingService.deleteBooking(bookingId);
	}

    @GetMapping
    public ResponseEntity<List<BookingItem>> getAllBookingItems() {
        List<BookingItem> bookingItems = bookingItemService.findAllBookingItem();
        return new ResponseEntity<>(bookingItems, HttpStatus.OK);
    }

    @GetMapping("/{bookingItemId}")
    public ResponseEntity<BookingItem> getBookingItemById(@PathVariable Long bookingItemId) {
        BookingItem bookingItem = bookingItemService.findBookingItemById(bookingItemId);
        return new ResponseEntity<>(bookingItem, HttpStatus.OK);
    }

    @DeleteMapping("/{bookingItemId}")
    public ResponseEntity<Void> deleteBookingItem(@PathVariable Long bookingItemId) {
        try {
            bookingItemService.deleteBookingItem(bookingItemId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        List<Passenger> passengers = passengerService.findAllPassengers();
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }

    @GetMapping("/{passId}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long passId) {
        Passenger passenger = passengerService.findPassengerById(passId);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
        Passenger createdPassenger = passengerService.createPassenger(passenger);
        return new ResponseEntity<>(createdPassenger, HttpStatus.CREATED);
    }

    @PutMapping("/{passId}")
    public ResponseEntity<Passenger> updatePassenger(
            @PathVariable Long passId,
            @RequestBody Passenger passenger) {
        passenger.setPassId(passId);
        Passenger updatedPassenger = passengerService.updatePassenger(passenger);
        return new ResponseEntity<>(updatedPassenger, HttpStatus.OK);
    }

    @DeleteMapping("/{passId}")
    public ResponseEntity<Void> deletePassenger(@PathVariable Long passId) {
        try {
            passengerService.deletePassenger(passId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    
    }
}