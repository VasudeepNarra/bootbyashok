package com.tekleads.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tekleads.domain.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	public ContactDaoImpl() {
		System.out.println("ContactDaoImpl::Constructor");
	}

	@Autowired
	private JdbcTemplate jt;

	private static final String INSERT_SQL = "INSERT INTO CONTACT_DTLS VALUES (?,?,?)";

	public boolean saveContacts(List<Contact> list) {

		int[] arr = jt.batchUpdate(INSERT_SQL, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				Contact c = list.get(index);
				ps.setInt(1, c.getContactId());
				ps.setString(2, c.getContactName());
				ps.setLong(3, c.getContactNum());
			}

			@Override
			public int getBatchSize() {
				return list.size();
			}
		});

		return arr.length > 0;
	}

}
