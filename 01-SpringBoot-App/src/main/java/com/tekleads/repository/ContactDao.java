package com.tekleads.repository;

import org.springframework.stereotype.Repository;

@Repository("daoNew")
public class ContactDao {

	public ContactDao() {
		System.out.println("ContactDao::Constructor (new)");
	}

}
