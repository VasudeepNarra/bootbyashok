package com.tekleads.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/rest")
public class WelcomeRestResource {

	@GetMapping("/welcome")
	public String welcomeMsg(
			@RequestParam(name = "name", defaultValue = "John") @ApiParam(value = "Required Name") String name) {
		String msg = name + ", Welcome to RESTful Services...!!";
		return msg;
	}

	@GetMapping("/greet/{name}")
	public String greetMsg(@PathVariable("name") String name) {
		String msg = name + ", Good Afternoon...!!";
		return msg;
	}
}
