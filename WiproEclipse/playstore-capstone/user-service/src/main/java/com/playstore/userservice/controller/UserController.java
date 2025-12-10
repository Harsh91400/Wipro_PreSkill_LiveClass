package com.playstore.userservice.controller;

import com.playstore.userservice.dto.AuthResponse;
import com.playstore.userservice.dto.UserLoginRequest;
import com.playstore.userservice.dto.UserRegisterRequest;
import com.playstore.userservice.entity.User;
import com.playstore.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserRegisterRequest request) {
        return ResponseEntity.ok(userService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody UserLoginRequest request) {
        return ResponseEntity.ok(userService.login(request));
    }

    @GetMapping("/hello")
    public String hello() {
        return "User service is working";
    }
}
