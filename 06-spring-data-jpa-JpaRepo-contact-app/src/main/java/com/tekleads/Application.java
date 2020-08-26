package com.tekleads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tekleads.service.ContactService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ContactService service = ctxt.getBean(ContactService.class);
		//service.getAllContacts01();// retrieve records using Pageble
		//service.getAllContacts02();// retrieve all records using sorting
		//service.getAllContacts03();//Example
		service.saveContact();
	}
}
