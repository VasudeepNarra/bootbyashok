package com.tekleads.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekleads.repository.ContactDao;

@Service
public class ContactService {

	@Autowired
	private ContactDao dao;

	public void m1() {
		System.out.println(dao.getClass().getName());
	}

}
