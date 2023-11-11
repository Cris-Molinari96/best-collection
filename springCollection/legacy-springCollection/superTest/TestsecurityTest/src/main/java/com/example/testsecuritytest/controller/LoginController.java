package com.example.testsecuritytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping("/mostra-login")
    public String showLoginPage(){
        return "plain-login";
    }

}
