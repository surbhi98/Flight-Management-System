package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.model.Flight;

import com.service.FlightService;



@Controller
public class FlightController {
	
	@Autowired(required=false)
	FlightService flightService;
	
	public FlightController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/search")

	public String search(Model model)

	{	
		model.addAttribute("flight", new Flight());
		return "search";
		
		

	}
	
	@RequestMapping("/cancel")

	public String cancel()

	{	
		
		return "booking";

		

	}
	
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public String getAllFlights(Model model) {
		model.addAttribute("flight", new Flight());
		model.addAttribute("listflights", this.flightService.getAllFlights());
		return "searchResult";
	}
	
	@RequestMapping(value = "/flightfilter", method = RequestMethod.POST)
	public String flightfilter(Model model, Flight flight) {
		model.addAttribute("flight", new Flight());
		String source=flight.getSource();
		String destination=flight.getDestination();
		String date=flight.getDate();
		model.addAttribute("listflights", this.flightService.findBySourceAndDestinationAndDate(source, destination, date));
		return "searchResult";
	}
	
	@RequestMapping(value= "/flight/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("flight") Flight f){
		System.out.println("#####product :"+f);
			this.flightService.addFlight(f);
		return "redirect:/adminflights";
	}
	
	@RequestMapping("/removeflightbyadmin/{flightId}")
    public String removeProduct(@PathVariable("flightId") int flightId){
		
        this.flightService.deleteFlight(flightId);
        return "redirect:/adminflights";
    }
	
	@RequestMapping(value = "/adminflights", method = RequestMethod.GET)
	public String adminflights(Model model) {
		model.addAttribute("flight", new Flight());
		model.addAttribute("listflights", this.flightService.getAllFlights());
		return "Admin";
	}
	
	
	/*@RequestMapping(value = "/getByFlightId/", method = RequestMethod.GET)
	public String getByFlightId(Model model,Flight flight) {
		model.addAttribute("FlightResult", this.flightService.getFlightById(flight.getFlightId()));
		return "searchResult";
		}
		*/
	
	
	
}
