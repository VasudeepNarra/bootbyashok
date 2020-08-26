package com.tekleads.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class WelcomeResourceTest {

	@InjectMocks
	private WelcomeRestResource welcomeResource;

	@Test
	public void testGreetMsg() {
		ResponseEntity<String> responseEntity = welcomeResource.greetMsg("John");
		int status = responseEntity.getStatusCodeValue();
		assertEquals(200, status);
	}

	@Test
	public void testWelcomeMsg() {
		ResponseEntity<String> responseEntity = welcomeResource.welcomeMsg("John");
		int status = responseEntity.getStatusCodeValue();
		assertEquals(200, status);
	}
}
