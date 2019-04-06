package com.fujitsu.orm.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.beans.Address;
import com.fujitsu.beans.Customer;


public class HibernateMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create configuration 
		
		Configuration cfg= new Configuration();
		
		//read hibernate properties from hibernate.cfg.xml
		Configuration c = cfg.configure();
		
		//obtain session factory through configuration
		SessionFactory factory =c.buildSessionFactory();
		
		//get session from sessionfactory
		//represents database connection
		Session session = factory.openSession();
		
		//get transaction through session
		Transaction tx = session.beginTransaction();
	
		//database operation logic
		
		Address address = new Address();
		
		Customer customer = new Customer();
		
		customer.setAddress(address);
		
		session.save(customer);
		//1-insert new product
		
		//commit transaction
		tx.commit();
		
		//close session-close database connection
		session.close();
		
	}

}
