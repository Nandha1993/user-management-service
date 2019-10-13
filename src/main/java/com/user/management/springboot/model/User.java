package com.user.management.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 
 * @author NandhaKumar KR
 *
 */

//User model or domain class 

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
  
  private long id;
  private String firstName;
  private String lastName;
  private String emailId;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedby;
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public long getId() {
    return id;
  }
  
  @Column(name = "first_name", nullable = false)
  public String getFirstName() {
    return firstName;
  }
  
  @Column(name = "last_name", nullable = false)
  public String getLastName() {
    return lastName;
  }
  
  @Column(name = "email_address", nullable = false)
  public String getEmailId() {
    return emailId;
  }
  
  @Column(name = "created_at", nullable = false)
  @CreatedDate
  public Date getCreatedAt() {
    return createdAt;
  }
  
  @Column(name = "created_by", nullable = false)
  @CreatedBy
  public String getCreatedBy() {
    return createdBy;
  }
  
  @Column(name = "updated_at", nullable = false)
  @LastModifiedDate
  public Date getUpdatedAt() {
    return updatedAt;
  }
  
  @Column(name = "updated_by", nullable = false)
  @LastModifiedBy
  public String getUpdatedby() {
    return updatedby;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }  
  
}
