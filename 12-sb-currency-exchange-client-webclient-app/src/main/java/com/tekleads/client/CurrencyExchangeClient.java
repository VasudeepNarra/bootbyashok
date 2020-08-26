package com.tekleads.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.tekleads.response.CurrencyExchange;

@Service
public class CurrencyExchangeClient {
	
	public void invokeCEApiSync01(String from, String to) {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		
		System.out.println("*********** Before Rest Call ***********");
		
		String respMsg = webClient.get()
				 				.uri(restUrl, from,to)
				 				.retrieve()
				 				.bodyToMono(String.class)
				 				.block();
		
		System.out.println(respMsg);

		System.out.println("*********** After Rest Call ***********");

		System.out.println("test");
		
	}
	
	public void invokeCEApiSync02(String from, String to) {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		
		System.out.println("*********** Before Rest Call ***********");
		
		CurrencyExchange ce = webClient.get()
				 				.uri(restUrl, from,to)
				 				.retrieve()
				 				.bodyToMono(CurrencyExchange.class)
				 				.block();
		System.out.println(ce);
		System.out.println("*********** After Rest Call ***********");
	}
	
	public void invokeCEApiAsync01(String from, String to) {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		System.out.println("*********** Before Rest Call ***********");
		
		webClient.get()
		.uri(restUrl, from,to)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(CurrencyExchangeClient::handleCeResponse);

		System.out.println("*********** After Rest Call ***********");
	}
	
	public void invokeCEApiAsync02(String from, String to) {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		System.out.println("*********** Before Rest Call ***********");
		
		webClient.get()
		.uri(restUrl, from,to)
		.retrieve()
		.bodyToMono(CurrencyExchange.class)
		.subscribe(CurrencyExchangeClient::handleCeResponse);

		System.out.println("*********** After Rest Call ***********");
	}
	
	public static void handleCeResponse(String response) {
		//logic
		System.out.println(response);
	}
	
	public static void handleCeResponse(CurrencyExchange response) {
		//logic
		System.out.println(response);
	}
}
