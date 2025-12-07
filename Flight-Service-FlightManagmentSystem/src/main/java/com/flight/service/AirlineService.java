package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.Airline;
import com.flight.entity.AirlineWrapper;
import com.flight.repository.AirlineRepository;

@Service
public class AirlineService {
	@Autowired
	private AirlineRepository airlineRepository;
	public Integer airline(AirlineWrapper a) {
		Airline airline  = new Airline();
		airline.setAirlineName(a.getAirlineName());
		return airlineRepository.save(airline).getId();
	}
}
