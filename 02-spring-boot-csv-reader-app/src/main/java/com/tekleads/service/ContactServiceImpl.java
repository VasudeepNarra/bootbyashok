package com.tekleads.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekleads.dao.ContactDao;
import com.tekleads.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	public ContactServiceImpl() {
		System.out.println("ContactServiceImpl::Constructor");
	}

	@Autowired
	private ContactDao dao;

	@Override
	public void batchOperation() throws Exception {

		List<Contact> contactsList = new ArrayList<Contact>();

		FileReader fr = new FileReader(new File("Contact-Details.csv"));
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {
			String[] arr = line.split(",");
			Contact c = new Contact(Integer.parseInt(arr[0]), arr[1], Long.parseLong(arr[2]));
			contactsList.add(c);

			// reading nextline data
			line = br.readLine();
		}
		br.close();

		boolean isSaved = dao.saveContacts(contactsList);
		System.out.println("Records Saved ? :: " + isSaved);
	}
}
