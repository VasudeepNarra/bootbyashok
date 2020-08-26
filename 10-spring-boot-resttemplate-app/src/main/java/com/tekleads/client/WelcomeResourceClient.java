package com.tekleads.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeResourceClient {

	public String invokeGreetMsg() {
		String respBody = null;
		String restUrl = "http://localhost:9091/rest/greet/{name}";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> respEntity = rt.getForEntity(restUrl, String.class, "John");
		int status = respEntity.getStatusCode().value();
		if (status == 200) {
			respBody = respEntity.getBody();
		}
		return respBody;
	}

}
