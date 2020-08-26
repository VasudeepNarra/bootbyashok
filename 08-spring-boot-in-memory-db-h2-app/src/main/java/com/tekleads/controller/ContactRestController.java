package com.tekleads.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tekleads.entity.ContactDtlsEntity;
import com.tekleads.repository.ContactDtlsRepository;

@RestController
public class ContactRestController {

	@Autowired
	private ContactDtlsRepository repo;

	@GetMapping(value = "/get/{id}")
	public ContactDtlsEntity getContactById(@PathVariable("id") Integer id) {
		Optional<ContactDtlsEntity> findById = 
								repo.findById(id);
		return findById.get();
	}

}
