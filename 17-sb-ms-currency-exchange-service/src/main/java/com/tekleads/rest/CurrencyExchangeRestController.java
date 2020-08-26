package com.tekleads.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.entity.CurrencyExchangeEntity;
import com.tekleads.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeRestController {

	@Autowired
	private CurrencyExchangeRepository ceRepo;

	@GetMapping(value = "/getCost/from/{from}/to/{to}")
	public ResponseEntity<Double> getExchangeCost(@PathVariable("from") String from, @PathVariable("to") String to) {
		CurrencyExchangeEntity entity = 
				ceRepo.findByCurrencyFromAndCurrencyTo(from, to);
		Double currencyValue = entity.getCurrencyValue();
		return new ResponseEntity(currencyValue, HttpStatus.OK);
	}
}
