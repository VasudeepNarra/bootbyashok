package com.tekleads.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ContactIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "C";
		String sql = "SELECT CID_SEQ.NEXTVAL FROM DUAL";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Integer suffix = null;
		try {
			con = session.connection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				suffix = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return prefix + String.valueOf(suffix);
	}

}
