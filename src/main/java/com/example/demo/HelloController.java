package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/req1")
    private String sayHello() {
        return "Utkarsh madharchodh insaan hai";
    }
    
    @GetMapping("/req2")
    public String method2() {
    	return "90";
    }
    
    @GetMapping("/req3")
    public String method3() {
    	return "20932";
    }

    @GetMapping("erro")
    public String error(){return "<i>No data to show</i>";}
}