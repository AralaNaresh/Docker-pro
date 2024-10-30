package com.tcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDocker {
	
	@GetMapping("/test")
	public String runDocker() {
		return " We are working in Docker Server";
	}

}
