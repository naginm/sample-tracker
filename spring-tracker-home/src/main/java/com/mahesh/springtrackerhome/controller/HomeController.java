package com.mahesh.springtrackerhome.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HomeController {

	@GetMapping("/home")
	public String getMessage() {
		return "Hello Mahesh";
	}
	
	@PostMapping("/register")
	public String getRegisterDetails(@RequestBody String message) {
		return "Hello "+ message +"registered successfully";
	}
}
