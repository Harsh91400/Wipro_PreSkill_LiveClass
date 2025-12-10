package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	@GetMapping(value="harshit")
	public String harshit() {
		return "harshit";
	}
	@GetMapping(value="greatLearning")
	public String greatLearning() {
		return "greatLearning";
	}

}
