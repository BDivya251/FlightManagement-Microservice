package com.flight.exceptions;

public class AirlineAlreadyExist extends RuntimeException{
	public AirlineAlreadyExist(String msg) {
		super(msg);
	}
}
