package com.saptarshi.youpromised;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController	
public class YoupromisedApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoupromisedApplication.class, args);
	}
	@GetMapping 
	String 	wola() {
		return "Hello World6";
	}

	@GetMapping(path = "/promise")
	public String 	greeting() {
		return "Hello Love";
	}

}
