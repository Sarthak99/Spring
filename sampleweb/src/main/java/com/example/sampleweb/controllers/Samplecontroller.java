package com.example.sampleweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samplecontroller {

    @GetMapping("/hello/{name}")
    public String getData(@PathVariable String name){
        String val = "Hello "+ name;
        return val;
    }

}
