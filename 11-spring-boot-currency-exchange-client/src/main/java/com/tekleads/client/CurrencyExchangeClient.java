package com.tekleads.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tekleads.response.CurrencyExchangeResponse;

@Service
public class CurrencyExchangeClient {

	public String invokeCurrencyExchangeApi01() {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		String response = null;
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resEntity = rt.getForEntity(restUrl, String.class, "USD", "INR");
		int status = resEntity.getStatusCodeValue();
		if (status == 200) {
			response = resEntity.getBody();
		}
		return response;
	}

	public CurrencyExchangeResponse invokeCurrencyExchangeApi02(String from, String to) {
		String restUrl = "https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<CurrencyExchangeResponse> resEntity = rt.getForEntity(restUrl, CurrencyExchangeResponse.class,
				from, to);
		int status = resEntity.getStatusCodeValue();
		if (status == 200) {
			CurrencyExchangeResponse resBean = resEntity.getBody();
			return resBean;
		}
		return null;
	}

}
