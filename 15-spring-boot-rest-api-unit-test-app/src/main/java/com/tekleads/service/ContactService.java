package com.tekleads.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tekleads.domain.Contact;
import com.tekleads.domain.Contacts;

@Service
public class ContactService {

	public Contact getContactById(Integer cid) {
		if (cid <= 100) {
			Contact c = new Contact();
			c.setContactId(cid);
			c.setContactName("Charles");
			c.setContactNumber(979797979l);
			c.setGender("Male");
			return c;
		}
		return null;
	}

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
}
