package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Airline;
import com.flight.entity.AirlineWrapper;
import com.flight.service.AirlineService;

import jakarta.validation.Valid;

@RestController
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	@PostMapping("/flight/airline/add")
	public Integer addAirline(@Valid AirlineWrapper a) {
		return airlineService.airline(a);
	}
}
