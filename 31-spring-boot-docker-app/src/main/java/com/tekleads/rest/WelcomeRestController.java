package com.tekleads.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/getMsg")
	public String getMsg() {
		return "<h1>Welcome to Containerization using Docker.....!!!!</h1>";
	}
}
