package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {
	

	public static void main(String[] args) {
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();

	    Answer a1 = new Answer();
	    a1.setAnswerid(1);
	    a1.setAnswer("programming language");
	    
	    Answer a2 = new Answer();
	    a2.setAnswer("coding language");
	    
	    List<Answer> list = new ArrayList<Answer>();
	    list.add(a1);
	    session.save(a1);
	    list.add(a2);
	    session.save(a2);
	    
	    Question q1 = new Question();
	    
	    q1.setQuestionid(1);
	    q1.setQuestion("what is java??"); 
	    q1.setAnswer(list);
	    a1.setQuestionid(q1);
	    a2.setQuestionid(q1);
	    
	    session.save(q1);
	    
	    tx.commit();
	    session.close();
	    
	    //fetching the data
	    Question question = (Question)session.get(Question.class, 1);
	    System.out.println(question.getQuestion());
	    System.out.println(question.getAnswer().getClass());
	    
	    factory.close();
	    System.out.println("Success!");
	}
}


