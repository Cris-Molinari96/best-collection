package com.example.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }


    // * aggiunta get mapping per /leaders
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }
    // * aggiunta get mapping per /systems
    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }
    // * aggiunta get mapping per /accesso-negato
    @GetMapping("/accesso-negato")
    public String showAccessDenied(){
        return "access-denied";
    }

}
