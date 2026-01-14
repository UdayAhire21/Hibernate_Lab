package com.Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main( String []arg ) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		Project pj1 = new Project();
		pj1.setPid(1);
		pj1.setPname("AI ML");
		
		Project pj2 = new Project();
		pj2.setPid(2);
		pj2.setPname("Ecomerse APP");
		
		Employee emp1 = new Employee();
		emp1.setEid(1);
		emp1.setName("odda");
		
		Employee emp2 = new Employee();
		emp2.setEid(2);
		emp2.setName("luffy");
		
		Employee emp3 = new Employee();
		emp3.setEid(3);
		emp3.setName("zoro");
		
		Employee emp4 = new Employee();
		emp4.setEid(4);
		emp4.setName("nami");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		List<Project> pj = new ArrayList<Project>();
		pj.add(pj1);
		pj.add(pj2);

		emp1.setProjects(pj);
		emp2.setProjects(pj);
		emp3.setProjects(pj);
		emp4.setProjects(pj);
		
		pj1.setEmployees(emp);
		pj2.setEmployees(emp);
		
//		pj.set(1, pj2);
//		pj.set(2, pj1);
//		pj.set(3, pj2);
//		pj.set(4, pj1);
		
		s.save(pj1);
		s.save(pj2);
		s.save(emp1);
		s.save(emp2);
		s.save(emp3);
		s.save(emp4);
		tx.commit();
		s.close();
		factory.close();
		System.out.println("Sucess!!");
	}
}
