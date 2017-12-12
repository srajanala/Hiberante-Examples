package com.hiber.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 UserDetails user = new UserDetails();
		
		user.setUserName("Sai");
		user.setJoinedDate(new Date());
		user.setAddress("User1 Address");
		user.setDescription("User1 Description");
		
	 UserDetails user2 = new UserDetails();
	     
	   user2.setUserName("Krish");
	   user2.setJoinedDate(new Date());
	   user2.setAddress("User2 Address");
	   user2.setDescription("User2 Description");
		
		
  SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
    Session session=sessionfactory.openSession();
     session.beginTransaction();
      session.save(user);
      session.save(user2);
     session.getTransaction().commit();
     session.close();
     
     session = sessionfactory.openSession();
     session.beginTransaction();
     user = session.get(UserDetails.class, 1);
     System.out.println("User name of 1st UserID 1 is: "+user.getUserName());
     

	}

}
