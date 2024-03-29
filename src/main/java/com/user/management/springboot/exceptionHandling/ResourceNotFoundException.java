package com.user.management.springboot.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * 
 * @author NandhaKumar KR
 *
 */

// Custom Exception Handling for resource not found exception

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {  

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
