package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/showemploy")
	public Flux<Employ> show() {
		return employService.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Mono<Employ> searchEmploy(@PathVariable int id) {
		return employService.searchEmployee(id);
	}
	
	@PostMapping(value="/addEmploy")
	public Mono<Employ> addEmploy(@RequestBody Employ employ) {
		return employService.addEmploy(employ);
	}
}
