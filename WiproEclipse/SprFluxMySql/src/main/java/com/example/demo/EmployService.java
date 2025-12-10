package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	public Flux<Employ> showEmploy() {
		return employRepository.findAll();
	}
	
	public Mono<Employ> addEmploy(Employ employ) {
		 return employRepository.save(employ);
	}
	public Mono<Employ> searchEmployee(int id) {
		return employRepository.findById(id);
	}
	
	public Mono<Employ> saveEmployee(Employ employee) {
		return employRepository.save(employee);
	}
	
	public Mono<Void> deleteById(int id) {
		    return employRepository.deleteById(id);
	}
}
