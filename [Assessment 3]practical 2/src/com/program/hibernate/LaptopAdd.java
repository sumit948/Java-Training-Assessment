package com.program.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopAdd {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Laptop lp = new Laptop();
		lp.setModelNo("Hp i5");
		session.save(lp);
		tx.commit();
		sf.close();

	}

}
