package com.springdemo.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

}
