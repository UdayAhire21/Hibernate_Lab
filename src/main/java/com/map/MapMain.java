package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {
	

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		Question q1 = new Question();
		q1.setQuestionid(1);
		q1.setQuestion("what is java?");
		
		session.save(q1);
		
		Question q2 = new Question();
		q2.setQuestionid(2);
		q2.setQuestion("what is inheritance?");
		
		session.save(q2); 
		
		Question q3 = new Question();
		q3.setQuestionid(3);
		q3.setQuestion("what is containment?");
		
		session.save(q3);
		
		Answer a1 = new Answer();
		a1.setAnswer("it is programing language.");
		a1.setAnswerid(18);
		q1.setAnswerid(a1);
		//session.save(a1);
		
		Answer a2 =  new Answer();
		a2.setAnswer("When one object use another object as a parth of its attribute it is called conatinment.");
		a2.setAnswerid(25);
		q3.setAnswerid(a2);
		//session.save(a2);
		
		Answer a3 =  new Answer();
		a3.setAnswer("it is use for generalization.");
		a3.setAnswerid(345);
		q2.setAnswerid(a3);
		//session.save(a3);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println(factory);
        System.out.println(factory.isClosed());
        System.out.println("Done...");
	}

}
