package com.example.demojwt.controller;

import com.example.demojwt.model.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/")
    public String authenticateUser(@RequestBody LoginRequest loginRequest){
        return "login success";
    }
}
