package com.sv.dao.utility;

import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoUtility {

	@Autowired
	private SessionFactory factory;

	public Session openSession() {
		Session session = null;
		try {
			session = factory.openSession();
			System.out.println(session.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return session;
	}

	public long saveEntity(Object object) {
		Session session = null;
		Transaction txn = null;
		long id = 0;
		try {
			session = factory.openSession();
			txn = session.beginTransaction();
			id = (long) session.save(object);
			System.out.println(session.toString());
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			DaoUtility.closeSession(session);
		}
		return id;
	}

	public static void closeSession(Session session) {
		try {
			if (session != null)
				session.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
