package com.example.demo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends R2dbcRepository<Employ, Integer> {

	
}
