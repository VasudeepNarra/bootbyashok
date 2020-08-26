package com.tekleads.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tekleads.client.CurrencyExchangeClient;

@Service
public class CurrencyConversionService {
	
	@Autowired
	private CurrencyExchangeClient ceClient;

	public String convertCurrency01(String from, String to, Integer quantity) {
		String restUrl = "http://localhost:1111/getCost/from/{from}/to/{to}";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Double> resEntity = rt.getForEntity(restUrl, Double.class, from, to);
		Double currencyCost = resEntity.getBody();
		Double finalAmt = currencyCost * Double.parseDouble(String.valueOf(quantity));
		return "Converted Amount :: " + finalAmt;
	}
	
	public String convertCurrency02(String from, String to, Integer quantity) {
		ResponseEntity<Double> resEntity = ceClient.invokeCEApi(from, to);
		Double currencyCost = resEntity.getBody();
		Double finalAmt = currencyCost * Double.parseDouble(String.valueOf(quantity));
		return "Converted Amount :: " + finalAmt;
	}

}
