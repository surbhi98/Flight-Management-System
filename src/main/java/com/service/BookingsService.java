package com.service;

import java.util.List;

import com.model.Bookings;





public interface BookingsService {

	public List<Bookings> getAllBookings();
	public void addBooking(Bookings booking);
	public void deleteBooking(int bookingId);
	public Bookings getBookingById(int bookingId);
	public List<Bookings> getBookingByUserId(int userId);
	
}
