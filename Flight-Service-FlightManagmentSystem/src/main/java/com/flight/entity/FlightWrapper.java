package com.flight.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightWrapper {
	@NotBlank(message="flight number is required")
	private String flightNumber;
	@NotBlank(message="departure placce is required")
	private String departure;
	@NotBlank(message="arrival is required")
	private String arrival;
	@NotNull(message="travel date is required")
	private Date travelDate;
	@NotNull(message="departure time is required")
	private Time departureTime;
	@NotNull(message="arrival time is required")
	private Time arrivalTime;
	@NotBlank(message="availableseats are required")
	private Integer availableSeats;
	@NotBlank(message="ticketprice is required")
	private float ticketPrice;
	@NotBlank(message="airline id of this flight is required")
	private Integer airline;
}
