package com.tekleads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tekleads.entity.ContactDtlsEntity;
import com.tekleads.repository.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDtlsRepository contactDtlsRepo;

	@Override
	public void getAllContacts01() {
		PageRequest pageRequest = PageRequest.of(0, 3);
		Page<ContactDtlsEntity> page = contactDtlsRepo.findAll(pageRequest);
		List<ContactDtlsEntity> contactsList = page.getContent();
		contactsList.forEach(contact -> {
			System.out.println(contact);
		});
	}

	@Override
	public void getAllContacts02() {
		List<ContactDtlsEntity> list = contactDtlsRepo.findAll(Sort.by("contactName"));
		list.forEach(contact -> {
			System.out.println(contact);
		});
	}

	@Override
	public void getAllContacts03() {
		ContactDtlsEntity entity = new ContactDtlsEntity();
		entity.setContactName("Smith");
		entity.setContactNum(98788999l);

		Example<ContactDtlsEntity> e = Example.of(entity);

		List<ContactDtlsEntity> list = contactDtlsRepo.findAll(e);

		list.forEach(contact -> {
			System.out.println(contact);
		});
	}

	@Override
	public void saveContact() {
		ContactDtlsEntity entity = new ContactDtlsEntity();
		entity.setContactName("Steve");
		entity.setContactNum(96702387878l);
		contactDtlsRepo.save(entity);
	}

}
