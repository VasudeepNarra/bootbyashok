package com.tekleads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/getMsg")
	public String getMsg() {
		logger.info("started getMsg() method ");
		String msg = "Welcome to SpringBoot Logging...!!";

		int i = 10 / 0;

		logger.info("ended getMsg() method");
		return msg;
	}

}
