package com.tekleads.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.client.CurrencyExchangeClient;
import com.tekleads.response.CurrencyExchangeResponse;

@RestController
public class CurrencyConversionResource {

	@Autowired
	private CurrencyExchangeClient client;

	@GetMapping(value = "/convert/from/{from}/to/{to}/quantity/{quantity}")
	public String convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("quantity") Double quantity) {
		CurrencyExchangeResponse resBean = client.invokeCurrencyExchangeApi02(from, to);
		Double currencyValue = resBean.getCurrencyValue();
		Double convertedAmt = quantity * currencyValue;
		return "Converted Currency :: " + convertedAmt;
	}

}
