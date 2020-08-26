package com.tekleads.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.service.CurrencyConversionService;

@RestController
public class CurrencyConversionRestController {

	@Autowired
	private CurrencyConversionService ccService;

	@GetMapping(value = "/convert/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<String> convert(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("quantity") Integer quantity) {
		String resMsg = ccService.convertCurrency02(from, to, quantity);
		return new ResponseEntity<String>(resMsg, HttpStatus.OK);
	}
}
