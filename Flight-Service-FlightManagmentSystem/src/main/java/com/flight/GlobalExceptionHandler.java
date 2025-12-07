package com.flight;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.flight.exceptions.AirlineAlreadyExist;
import com.flight.exceptions.FlightAlreadyExisted;
import com.flight.exceptions.FlightNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidation(MethodArgumentNotValidException ex) {
        String msg = ex.getBindingResult().getFieldError().getDefaultMessage();
        System.out.println("Validation failed: " + msg); // <-- print here
        return ResponseEntity.badRequest().body(msg);
    }
	@ExceptionHandler(FlightNotFoundException.class)
	public ResponseEntity<String> handleFlightNotFound(FlightNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AirlineAlreadyExist.class)
	public ResponseEntity<String> handleAirlineNotFound(AirlineAlreadyExist ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(FlightAlreadyExisted.class)
	public ResponseEntity<String> handleDuplicateFlight(FlightAlreadyExisted ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
	}
}
