package com.tekleads.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.domain.Contact;
import com.tekleads.domain.Contacts;

@RestController
public class ContactRestResource {

	@GetMapping(value = "/contacts/{cid}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Contact> getContactById(@PathVariable("cid") Integer cid) {
		Contact c = new Contact();
		c.setContactId(cid);
		c.setContactName("Charles");
		c.setContactNumber(979797979l);
		c.setGender("Male");
		ResponseEntity<Contact> response = new ResponseEntity<Contact>(c, HttpStatus.OK);
		return response;
	}

	@GetMapping(value = "/contacts", produces = { "application/xml", "application/json" })
	public Contacts getAllContacts() {
		Contacts contacts = new Contacts();
		List<Contact> contactsList = new ArrayList<Contact>();
		Contact c1 = new Contact(101, "John", 979797988l, "M");
		Contact c2 = new Contact(102, "Smith", 807797988l, "M");
		Contact c3 = new Contact(103, "Shiba", 770707088l, "F");
		contactsList.add(c1);
		contactsList.add(c2);
		contactsList.add(c3);
		contacts.setContacts(contactsList);
		return contacts;
	}

	@PostMapping(value = "/addContact", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addContact(@RequestBody Contact c) {
		System.out.println(c);
		String respMsg = "Contact Saved Successfully";
		return new ResponseEntity<>(respMsg, HttpStatus.CREATED);
	}

	@PostMapping(value = "/addContacts", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addContacts(@RequestBody Contacts contacts) {
		List<Contact> contactsList = contacts.getContacts();
		contactsList.forEach(contact -> {
			System.out.println(contact);
		});
		String respMsg = "Contacts Saved Successfully";
		return new ResponseEntity<>(respMsg, HttpStatus.CREATED);
	}

	@GetMapping("/header")
	public String readHeaders(@RequestHeader("secret-key") String secretKey) {
		System.out.println(secretKey);
		return "ok";
	}
}
