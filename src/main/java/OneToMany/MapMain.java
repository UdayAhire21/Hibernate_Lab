package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {
	

	public static void main(String[] args) {
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();

	    // Data 1
	    Answer a1 = new Answer();
	    a1.setAnswer("It is a programming language.");
	    Question q1 = new Question();
	    q1.setQuestion("What is Java?");
	    q1.setAnswerid(a1); // Set the relationship

	    // Data 2
	    Answer a2 = new Answer();
	    a2.setAnswer("Generalization usage.");
	    Question q2 = new Question();
	    q2.setQuestion("What is inheritance?");
	    q2.setAnswerid(a2);

	    // Save only the Questions (Cascade saves the Answers)
	    session.save(q1);
	    session.save(q2);

	    tx.commit();
	    
	    Question newQ = (Question)session.get(Question.class,1);
	    System.out.println(newQ.getQuestion());
	    System.out.println(newQ.getAnswerid().getAnswer());
	    
	    session.close();
	    factory.close();
	    System.out.println("Success!");
	}
}


