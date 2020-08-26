package com.tekleads.resources;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import com.tekleads.domain.Contact;
import com.tekleads.service.ContactService;

@SpringBootTest
public class ContactRestResourceTest {

	@InjectMocks
	private ContactRestResource contactRestResource;

	@Mock
	private ContactService contactService;

	@Test
	public void testGetContactById() {
		Contact c = new Contact();
		c.setContactId(101);
		c.setContactName("John");
		c.setContactNumber(79797979l);

		when(contactService.getContactById(101)).thenReturn(c);

		ResponseEntity<Contact> responseEntity = contactRestResource.getContactById(101);

		Contact body = responseEntity.getBody();
		assertThat(body.getContactId()).isEqualTo(101);
	}
}
