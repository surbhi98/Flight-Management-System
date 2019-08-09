package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Flight;



public interface FlightDAO extends CrudRepository<Flight, Integer>{

	List<Flight> findBySourceAndDestinationAndDate(String source, String destination, String date);
	
}
