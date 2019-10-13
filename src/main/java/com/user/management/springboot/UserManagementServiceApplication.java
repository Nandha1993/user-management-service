package com.user.management.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 
 * @author NandhaKumar KR
 *
 */


//This class is the entry point of spring boot application

//@SpringBootApplication - This annotation is convenient annotation that adds the following:
// @Configuration - Tags the class as a source of bean definition of application context
// @AutoConfiguration - informs the sprint boot to start adding beans based on classpath settings and properties
//Component Scan - the spring looks for components, packages, services and so allowing it to find controllers

//@EnableJpaAuditing - enables the JPA auditing before persistence

@SpringBootApplication
@EnableJpaAuditing
public class UserManagementServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);
	}

}
