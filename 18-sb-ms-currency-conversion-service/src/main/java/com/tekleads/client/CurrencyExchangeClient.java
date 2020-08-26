package com.tekleads.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeClient {

	@GetMapping(value = "/getCost/from/{from}/to/{to}")
	public ResponseEntity<Double> invokeCEApi(@PathVariable("from") String from, @PathVariable("to") String to);
}
