package com.user.management.springboot.controller;

import com.user.management.springboot.repository.UserRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.management.springboot.exceptionHandling.ResourceNotFoundException;
import com.user.management.springboot.model.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {
  
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
}

  
  @GetMapping("/users/{id}")
  public ResponseEntity<User> getUserById(
  @PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
      User user = userRepository.findById(userId)
      .orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ userId));
      return ResponseEntity.ok().body(user);
  }
  
  @PostMapping("/users")
  public User createUser(@Valid @RequestBody User user) {
      return userRepository.save(user);
  }
  
  @PutMapping("/users/{id}")
  public ResponseEntity<User> updateUser(
  @PathVariable(value = "id") Long userId,
  @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
       User user = userRepository.findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ userId));

      user.setEmailId(userDetails.getEmailId());
      user.setLastName(userDetails.getLastName());
      user.setFirstName(userDetails.getFirstName());
      user.setUpdatedAt(new Date());
      final User updatedUser = userRepository.save(user);
      return ResponseEntity.ok(updatedUser);
 }

 @DeleteMapping("/user/{id}")
 public Map<String, Boolean> deleteUser(
     @PathVariable(value = "id") Long userId) throws Exception {
     User user = userRepository.findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ userId));

     userRepository.delete(user);
     Map<String, Boolean> response = new HashMap<>();
     response.put("deleted", Boolean.TRUE);
     return response;
 }
  
}
