package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/hello")
	public String hello() {
		return "Hello from Harshit...";
	}
	
	@GetMapping(value="/delete")
	public String deleteMapping() {
		return "This is Delete Content...";
	}
	
}
