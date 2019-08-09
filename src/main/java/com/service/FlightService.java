package com.service;

import java.util.List;

import com.model.Flight;




public interface FlightService {

	public List<Flight> getAllFlights();
	public Flight getFlightById(int flightId);
	public List<Flight> 
	findBySourceAndDestinationAndDate(String source, String destination, String date);	
	public void addFlight(Flight flight);
	public void deleteFlight(int flightId);
}

