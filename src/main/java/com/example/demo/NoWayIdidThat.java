package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoWayIdidThat {
	
	@GetMapping("/m19")
     public String m19() {
    	 return "madeit";
     }
}
