package com.controller;

import com.dto.dto;
import com.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


@RestController
public class Controller {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private ServiceInterface si;
    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody dto d){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                d.getEmail(), d.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }
}