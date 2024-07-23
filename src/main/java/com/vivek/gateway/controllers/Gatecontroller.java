package com.vivek.gateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Gatecontroller {
	private static final Logger logger = LoggerFactory.getLogger(Gatecontroller.class);
	
	  @GetMapping("/hellog") 
	  public String helloWorld() {
		  logger.info("Logging information message");
	        logger.error("Logging error message");
	  System.out.println("hello vivek"); 
	  return "Hello, World!"; 
	  
	  }
	 

}
