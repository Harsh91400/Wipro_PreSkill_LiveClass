package com.playstore.ownerservice.service;

import com.playstore.ownerservice.dto.AuthResponse;
import com.playstore.ownerservice.dto.OwnerLoginRequest;
import com.playstore.ownerservice.dto.OwnerRegisterRequest;
import com.playstore.ownerservice.entity.Owner;
import com.playstore.ownerservice.repository.OwnerRepository;
import com.playstore.ownerservice.security.JwtTokenProvider;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    public OwnerService(OwnerRepository ownerRepository,
                        PasswordEncoder passwordEncoder,
                        JwtTokenProvider jwtTokenProvider) {
        this.ownerRepository = ownerRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public Owner register(OwnerRegisterRequest request) {
        Owner owner = new Owner();
        owner.setName(request.getName());
        owner.setEmail(request.getEmail());
        owner.setPassword(passwordEncoder.encode(request.getPassword()));
        owner.setRole("OWNER");
        return ownerRepository.save(owner);
    }

    public AuthResponse login(OwnerLoginRequest request) {
        Owner owner = ownerRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Owner not found"));

        if (!passwordEncoder.matches(request.getPassword(), owner.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtTokenProvider.generateToken(owner);
        return new AuthResponse(token, owner.getRole());
    }
}
