package com.tekleads.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.domain.Contact;
import com.tekleads.domain.Contacts;
import com.tekleads.service.ContactService;

@RestController
public class ContactRestResource {

	@Autowired
	private ContactService contactService;

	@GetMapping(value = "/contacts/{cid}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Contact> getContactById(@PathVariable("cid") Integer cid) {
		Contact c = contactService.getContactById(cid);
		ResponseEntity<Contact> response = new ResponseEntity<Contact>(c, HttpStatus.OK);
		return response;
	}

	@GetMapping(value = "/contacts", produces = { "application/xml", "application/json" })
	public ResponseEntity<Contacts> getAllContacts() {
		Contacts allContacts = contactService.getAllContacts();
		return new ResponseEntity<Contacts>(allContacts, HttpStatus.OK);
	}

}
