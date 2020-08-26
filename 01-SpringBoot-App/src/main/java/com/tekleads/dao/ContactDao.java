package com.tekleads.dao;

import org.springframework.stereotype.Repository;

@Repository("daoOld")
public class ContactDao {

	public ContactDao() {
		System.out.println("ContactDao::Constructor (old)");
	}
}
