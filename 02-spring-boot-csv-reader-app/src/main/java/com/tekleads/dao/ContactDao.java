package com.tekleads.dao;

import java.util.List;

import com.tekleads.domain.Contact;

public interface ContactDao {

	public boolean saveContacts(List<Contact> list);

}
