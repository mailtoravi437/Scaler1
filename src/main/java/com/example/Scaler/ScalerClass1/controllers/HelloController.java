package com.example.Scaler.ScalerClass1.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable String name){
        return "bye.."+name;
    }
}
