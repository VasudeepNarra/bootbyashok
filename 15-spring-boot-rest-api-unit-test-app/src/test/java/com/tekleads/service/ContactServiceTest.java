package com.tekleads.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tekleads.domain.Contact;
import com.tekleads.domain.Contacts;

@SpringBootTest
public class ContactServiceTest {

	@Test
	public void testGetContactById01() {
		ContactService service = new ContactService();
		Contact contact = service.getContactById(50);
		assertNotNull(contact);
	}

	@Test
	public void testGetContactById02() {
		ContactService service = new ContactService();
		Contact contact = service.getContactById(120);
		assertNull(contact);
	}

	@Test
	public void testGetAllContacts() {
		ContactService service = new ContactService();
		Contacts allContacts = service.getAllContacts();
		assertNotNull(allContacts);
	}

}
