package com.tekleads.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestResource {

	@GetMapping("/greet/{name}")
	public ResponseEntity<String> greetMsg(@PathVariable("name") String name) {
		String msg = name + ", Good Afternoon...!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(@RequestParam(name = "name") String name) {
		String msg = name + ", Welcome to RESTful Services...!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
