package com.user.management.springboot.exceptionHandling;

import java.util.Date;
/**
 * 
 * @author Nandha
 *
 */

// Exception details

public class ErrorDetails {
  
  private Date timestamp;
  private String message;
  private String details;
  
  
  public ErrorDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }


  public Date getTimestamp() {
    return timestamp;
  }


  public String getMessage() {
    return message;
  }


  public String getDetails() {
    return details;
  }  
  
}
