package com.tcs.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg = " hai welcome  tcs";
		return msg;
	}

	public String getGreetMsg() {
		String msg = " Good mng";
		return msg;
	}
}
