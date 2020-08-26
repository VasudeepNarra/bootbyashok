package com.tekleads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekleads.entity.ContactDtlsEntity;
import com.tekleads.repository.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDtlsRepository contactRepo;

	public boolean saveContact(ContactDtlsEntity entity) {
		ContactDtlsEntity savedEntity = contactRepo.save(entity);
		return savedEntity != null;
	}
	
	public boolean updateContact(ContactDtlsEntity entity) {
		ContactDtlsEntity savedEntity = contactRepo.save(entity);
		return savedEntity != null;
	}

	@Override
	public boolean saveContacts(List<ContactDtlsEntity> entities) {
		Iterable<ContactDtlsEntity> saveAll = contactRepo.saveAll(entities);
		return saveAll != null;
	}

	@Override
	public ContactDtlsEntity getContactById(Integer cid) {
		Optional<ContactDtlsEntity> optional = contactRepo.findById(cid);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Iterable<ContactDtlsEntity> getAllContacts() {
		return contactRepo.findAll();
	}

	@Override
	public List<ContactDtlsEntity> getContactDtlsByName(String name) {
		return contactRepo.findByContactName(name);
	}
	
	@Override
	public ContactDtlsEntity getContactByNameAndId(String name, Integer cid) {
		return contactRepo.findByContactNameAndContactId(name, cid);
	}
	
	@Override
	public Iterable<ContactDtlsEntity> getAllContactsBySorting() {
		return contactRepo.findAllContacts();
	}
}



