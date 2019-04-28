package com.sv.dao.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DaoUtility {

	public static Session openSession() {
		Session session = null;
		SessionFactory factory = null;
		try {
			factory = new Configuration().configure().buildSessionFactory();
			session = factory.openSession();
		} catch (Exception e) {
			throw e;
		}
		return session;
	}

	public long saveEntity(Object object) {
		Session session = null;
		Transaction txn = null;
		long id = 0;
		try {
			session = DaoUtility.openSession();
			txn = session.beginTransaction();
			id = (long) session.save(object);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			throw e;
		} finally {
			DaoUtility.closeSession(session);
		}
		return id;
	}

	public static void closeSession(Session session) {
		try {
			session.close();
		} catch (Exception e) {
			throw e;
		}
	}
}
