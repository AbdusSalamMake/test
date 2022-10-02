package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	
	@GetMapping("/get")
	public String getItemGet() {
		return "Hello World";
		
	}

}
