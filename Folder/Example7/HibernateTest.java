package com.hiber.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Address;
import com.hibernate.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 UserDetails user = new UserDetails();
		
		user.setUserName("Sai");
		
		Address addr = new Address();
		addr.setCity("Overlandpark");
		addr.setState("Kansas State");
		
		
		user.setAddress(addr);

		
  SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    Session session=sessionfactory.openSession();
     session.beginTransaction();
      session.save(user);
     session.getTransaction().commit();
     session.close();
     sessionfactory.close();
     
     

	}

}
