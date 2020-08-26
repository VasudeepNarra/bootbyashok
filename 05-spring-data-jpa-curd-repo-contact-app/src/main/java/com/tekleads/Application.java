package com.tekleads;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tekleads.entity.ContactDtlsEntity;
import com.tekleads.service.ContactService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ContactService service = ctxt.getBean(ContactService.class);
		
		Iterable<ContactDtlsEntity> entities = service.getAllContactsBySorting();
		entities.forEach(contact -> {
			System.out.println(contact);
		});
		
		/*ContactDtlsEntity entity = service.getContactByNameAndId("Shiba", 105);
		System.out.println(entity);*/
		
		/*List<ContactDtlsEntity> entities = service.getContactDtlsByName("Nick");
		entities.forEach(contact -> {
			System.out.println(contact);
		});*/
		
		//ContactDtlsEntity entity = new ContactDtlsEntity(102, "Johns", 89797979l);
		//service.updateContact(entity);
		
		
		/*ContactDtlsEntity entity = service.getContactById(null);
		System.out.println(entity);*/
		
		/*Iterable<ContactDtlsEntity> allContacts = service.getAllContacts();
		allContacts.forEach(contact -> {
			System.out.println(contact);
		});*/
		

		/*ContactDtlsEntity entity1 = new ContactDtlsEntity(101, "Charles", 79797979l);
		ContactDtlsEntity entity2 = new ContactDtlsEntity(102, "Orlen", 89797979l);
		ContactDtlsEntity entity3 = new ContactDtlsEntity(103, "Smith", 69797979l);

		List<ContactDtlsEntity> list = new ArrayList<ContactDtlsEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		
		boolean isSaved = service.saveContacts(list);
		
		System.out.println("Records saved ? :: " + isSaved);*/
	}
}
