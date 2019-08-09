package com.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Bookings;
import com.model.User;
import com.service.BookingsService;

@Controller
public class BookingController {

	@Autowired
	BookingsService bookingsService;
	
	public BookingController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/bookings", method = RequestMethod.GET)
	public String getAllBookings(Model model, HttpSession session) {
		model.addAttribute("booking", new Bookings());
		
		Integer i=(Integer) session.getAttribute("user");
		System.out.println("THIS IS ID"+i);
		model.addAttribute("getAllBookings", this.bookingsService.getBookingByUserId(i));
		return "booking";
	}
	
	
	@RequestMapping(value= "/bookings/{flightId}/{price}", method = RequestMethod.GET)
	public String addBooking(@PathVariable("flightId") int flightId,@PathVariable("price") int tp,HttpSession session){
			
			Bookings booking=new Bookings();
			booking.setFlightId(flightId);
			Random random=new Random();
			int r=random.nextInt(100);
			booking.setBookingId(r);
			Integer i=(Integer) session.getAttribute("user");
			booking.setNop(1);
			booking.setUserId(i);
			booking.setTotalprice(tp);
			// Get UserId and NOP, totalPrice=price*NOP from session 
			
			this.bookingsService.addBooking(booking);
		return "redirect:/bookings";
	}
	
	@RequestMapping("/removebooking/{bookingId}")
    public String removeBooking(@PathVariable("bookingId") int bookingId){
		
        this.bookingsService.deleteBooking(bookingId);
        return "redirect:/bookings";
    }
	@RequestMapping(value = "/getByBookingId", method = RequestMethod.GET)
	public String getByBookingId(@PathVariable("getByBookingId") int bookingId, Model model) {
		model.addAttribute("getByFlightId", this.bookingsService.getBookingById(bookingId));
		return "booking";
	}
	
}
