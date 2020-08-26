package com.tekleads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public Application() {
		System.out.println("Application::Constructor");
	}

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ctxt.close();
	}
}
