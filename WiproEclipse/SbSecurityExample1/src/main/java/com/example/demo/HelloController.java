package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/home")
	public String security() {
		return "Welcome to Spring Boot Security Content...";
	}
}
