package com.tekleads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tekleads.service.CustomerEventService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		CustomerEventService bean = ctxt.getBean(CustomerEventService.class);
		bean.invokeCustomerEvent();
		System.out.println("-------------Flux Response-----------");
		bean.invokeCustomerEvents();
	}

}
