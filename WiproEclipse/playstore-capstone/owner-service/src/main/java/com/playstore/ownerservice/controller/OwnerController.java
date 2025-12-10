package com.playstore.ownerservice.controller;

import com.playstore.ownerservice.dto.AuthResponse;
import com.playstore.ownerservice.dto.OwnerLoginRequest;
import com.playstore.ownerservice.dto.OwnerRegisterRequest;
import com.playstore.ownerservice.entity.Owner;
import com.playstore.ownerservice.service.OwnerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping("/register")
    public ResponseEntity<Owner> register(@RequestBody OwnerRegisterRequest request) {
        return ResponseEntity.ok(ownerService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody OwnerLoginRequest request) {
        return ResponseEntity.ok(ownerService.login(request));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Owner service is working";
    }
}
