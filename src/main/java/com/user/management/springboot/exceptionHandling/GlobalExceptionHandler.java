package com.user.management.springboot.exceptionHandling;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * @author NandhaKumar KR
 *
 */

//@ControllerAdvice is used for handling global exception for controllers
// It is also allowed to restrict the scope of controllers to be exception handled : example - @ControllerAdvice("Controller")

@ControllerAdvice
public class GlobalExceptionHandler {
  
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex , WebRequest webRequest) {    
    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), webRequest.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);    
  }
  
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<?> genericException(Exception ex , WebRequest webRequest) {    
    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), webRequest.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);    
  }

}
