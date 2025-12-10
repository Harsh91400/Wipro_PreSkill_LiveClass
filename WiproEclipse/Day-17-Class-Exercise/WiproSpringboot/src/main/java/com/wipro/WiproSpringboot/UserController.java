package com.wipro.WiproSpringboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<Map<String, Object>> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/user")
	public String addUser( @RequestBody User obj) {
		userService.addUser(obj);
		return "User added!";
	}

	@GetMapping("/users/{id}")
	public Map<String, Object> getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}
}