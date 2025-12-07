package com.flight.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline,Integer> {

	Optional<Airline> findByAirlineName(String airlineName);

}
