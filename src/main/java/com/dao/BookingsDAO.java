package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Bookings;
import com.model.Flight;

public interface BookingsDAO extends CrudRepository<Bookings, Integer>{

	public List<Bookings> findByUserId(int userId);
}
