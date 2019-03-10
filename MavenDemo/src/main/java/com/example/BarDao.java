package com.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BarDao {
	
	public void save(Bar bar, SessionFactory factory) {
		Session session =factory.openSession();
		
		Transaction trans=session.beginTransaction();
		
		try {
			session.save(bar);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		}finally {
			session.close();
		}
		
		
		
	}
	
}
