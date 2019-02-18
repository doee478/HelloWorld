package com.doee478.helloworld.helloworld.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/home")
	String home() {
		return "Home Page";
	}

	@RequestMapping("/landing")
	String landing() {
		return "Welcome to the website";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}

}
