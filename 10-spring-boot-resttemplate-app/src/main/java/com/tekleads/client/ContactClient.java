package com.tekleads.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tekleads.request.ContactRequest;

@Service
public class ContactClient {

	@Autowired
	private RestTemplate rt;

	public void invokeAddContact() {
		String resUrl = "http://localhost:9091/addContact";

		ContactRequest reqBody = new ContactRequest();
		reqBody.setContactId(101);
		reqBody.setContactName("John");
		reqBody.setContactNumber(79797979l);
		reqBody.setGender("M");

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");

		HttpEntity<ContactRequest> reqEntity = new HttpEntity<ContactRequest>(reqBody, headers);

		ResponseEntity<String> resEntity = rt.postForEntity(resUrl, reqEntity, String.class);

		int status = resEntity.getStatusCodeValue();
		if (status == 201) {
			String resBody = resEntity.getBody();
			System.out.println(resBody);
		}
	}

}
