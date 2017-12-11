package com.hiber.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		user.setUserID(2);
		user.setUserName("Sai");
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
