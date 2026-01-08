package com.seed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		
//		Address ad =(Address)session.get(Address.class, 1);
//		System.out.println(ad.getStreet()+" : "+ad.getCity());
		
//		Address ad =(Address)session.load(Address.class, 1);
//		System.out.println(ad.getStreet()+" : "+ad.getCity());
		
		session.close();
		factory.close();
		
	}

}
