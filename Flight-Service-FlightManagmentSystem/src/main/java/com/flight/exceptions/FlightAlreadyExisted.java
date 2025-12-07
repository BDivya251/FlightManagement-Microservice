package com.flight.exceptions;

public class FlightAlreadyExisted extends RuntimeException{
	public FlightAlreadyExisted(String msg) {
		super(msg);
	}
}
