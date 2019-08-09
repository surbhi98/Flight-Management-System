package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookingsDAO;
import com.model.Bookings;


@Service
public class BookingServiceImpl implements BookingsService{

	@Autowired
	BookingsDAO bookingsDAO;
	
	@Override
	@Transactional
	public List<Bookings> getAllBookings() {
		return (List<Bookings>)bookingsDAO.findAll();
	}

	@Override
	@Transactional
	public void addBooking(Bookings booking) {
		bookingsDAO.save(booking);
		
	}

	@Override
	@Transactional
	public void deleteBooking(int bookingId) {
		bookingsDAO.deleteById(bookingId);
		
	}

	@Override
	@Transactional
	public Bookings getBookingById(int bookingId) {
		Optional<Bookings> booking = bookingsDAO.findById(bookingId);
		if(booking.isPresent())
		{
			return booking.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Bookings> getBookingByUserId(int userId) {
		return bookingsDAO.findByUserId(userId);
		 
	}

}
