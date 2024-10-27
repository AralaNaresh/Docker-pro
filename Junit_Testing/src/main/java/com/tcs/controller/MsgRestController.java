package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	private MsgService msgService;

	@GetMapping("/map")
	public String getwelcome() {
		String msg = msgService.getWelcomeMsg();
		return msg;
	}

	@GetMapping("/Hai")
	public String greetreetMsg() {
		String msg = msgService.getGreetMsg();
		return msg;
	}
}
