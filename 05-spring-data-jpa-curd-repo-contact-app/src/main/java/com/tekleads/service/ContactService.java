package com.tekleads.service;

import java.util.List;

import com.tekleads.entity.ContactDtlsEntity;

public interface ContactService {

	public boolean saveContact(ContactDtlsEntity entity);
	
	public boolean updateContact(ContactDtlsEntity entity);

	public boolean saveContacts(List<ContactDtlsEntity> entities);

	public ContactDtlsEntity getContactById(Integer cid);

	public Iterable<ContactDtlsEntity> getAllContacts();
	
	public Iterable<ContactDtlsEntity> getAllContactsBySorting();

	
	public List<ContactDtlsEntity> getContactDtlsByName(String name);
	
	public ContactDtlsEntity getContactByNameAndId(String name, Integer cid);

}
