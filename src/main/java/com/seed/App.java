package com.seed;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session1 = factory.openSession();
        Transaction tx1 = session1.beginTransaction();
        Student st = new Student();
        st.setSid(1);
        st.setName("vidhi");
        st.setCity("Malegaon");
        System.out.println(st);
        session1.save(st);
        tx1.commit();
        session1.close();
        
        Session session2 = factory.openSession();
        Transaction tx2 = session2.beginTransaction();
        Address ad = new Address();
        ad.setStreet("street1 ");
        ad.setCity("Pune");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setX(12345678.34);
        
       
			FileInputStream fis = new FileInputStream("src/main/java/img.png");
			byte[] data = new byte[fis.available()];
			fis.read(data);
			ad.setImage(data);
        
        session2.save(ad);
        tx2.commit();
        session2.close();
        
        factory.close();
        System.out.println(factory);
        System.out.println(factory.isClosed());
        System.out.println("Done...");
    }
}
