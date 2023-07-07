package com.Assignment.GreenStitch.service;

import com.Assignment.GreenStitch.auth.AuthenticationRequest;
import com.Assignment.GreenStitch.auth.AuthenticationResponse;
import com.Assignment.GreenStitch.auth.RegisterRequest;
import com.Assignment.GreenStitch.service.JwtService;

import com.Assignment.GreenStitch.model.Role;
import com.Assignment.GreenStitch.model.User;
import com.Assignment.GreenStitch.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
//    public AuthenticationResponse register(RegisterRequest request) {
public String register(RegisterRequest request) {
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
       repository.save(user);
       var jwtToken = jwtService.generateToken(user);
//       return AuthenticationResponse.builder()
//               .token(jwtToken)
//               .build();
        return "User created and Authenticated";

    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
