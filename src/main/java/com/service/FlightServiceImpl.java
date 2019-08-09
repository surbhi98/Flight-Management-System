package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.FlightDAO;
import com.model.Flight;



@Service("flightService")
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightDAO flightDAO;
	
	@Override
	@Transactional
	public List<Flight> getAllFlights() {
		 return (List<Flight>)flightDAO.findAll();
	}

	@Override
	@Transactional
	public Flight getFlightById(int flightId) {
		Optional<Flight> flight = flightDAO.findById(flightId);
		if(flight.isPresent())
		{
			return flight.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Flight> findBySourceAndDestinationAndDate(String source, String destination, String date) {
		return (List<Flight>) 
				flightDAO.findBySourceAndDestinationAndDate(source, destination, date);
	}

	@Override
	public void addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightDAO.save(flight);
		
	}

	@Override
	public void deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		
		flightDAO.deleteById(flightId);
		
	}

}
