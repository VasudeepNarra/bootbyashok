package com.tekleads.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@Service
public class CustomerEventService {

	private String REST_URL1 = "http://localhost:1111/getEvent";
	private String REST_URL2 = "http://localhost:1111/getEvents";

	public void invokeCustomerEvent() {
		Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		String eventResponse = webClient.get()
										 .uri(REST_URL1)
										 .retrieve()
										 .bodyToMono(String.class)
										 .block();
		System.out.println(eventResponse);
	}
	
	public void invokeCustomerEvents() {
		Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		webClient.get()
				 .uri(REST_URL2)
				 .retrieve()
				 .bodyToFlux(String.class)
				 .subscribe(System.out::println);
	}
}
