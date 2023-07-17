package com.raphael.completeuserregistrationandloginsystemwithspringsecurity.controllers;

import com.unkownkoder.data.models.ApplicationUser;
import com.unkownkoder.dto.request.RegistrationDTO;
import com.unkownkoder.dto.response.LoginResponseDTO;
import com.unkownkoder.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }
    
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}   
