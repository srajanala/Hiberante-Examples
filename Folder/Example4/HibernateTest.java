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
		user.setUserID(1);
		user.setUserName("Sai");
		user.setJoinedDate(new Date());
		user.setAddress("User Address");
		user.setDescription("User Description");
		
 SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
 Session session=sessionfactory.openSession();
 session.beginTransaction();
 session.save(user);
 session.getTransaction().commit();
 session.close();
 
 session = sessionfactory.openSession();
 session.beginTransaction();
 user = session.get(UserDetails.class, 1);
 System.out.println("User name of 1st UserID 1 is: "+user.getUserName());
 
 

	}

}
