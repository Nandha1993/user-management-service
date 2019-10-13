package com.user.management.springboot.repository;

import com.user.management.springboot.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author NandhaKumar KR
 *
 */

// The interface with @Repository annotation. 
// This tells Spring to bootstrap the repository during a component scan

//JpaRepository  provides all the database operation
// Any custom methods also can be added here.

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
