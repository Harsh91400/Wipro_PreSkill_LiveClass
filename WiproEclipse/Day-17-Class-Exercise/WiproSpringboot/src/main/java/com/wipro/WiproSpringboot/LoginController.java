package com.wipro.WiproSpringboot;

import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	JdbcTemplate jdbcobj;

	@GetMapping("/login")
	public String checkUser() {
		jdbcobj.execute("insert into users(name,password)values('javatpoint',124512)");  
		return "login success";
	}

}
