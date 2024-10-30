package com.tcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

	@GetMapping("/hi")
	public String msg() {
		return " Docker we checking ";
	}
}
