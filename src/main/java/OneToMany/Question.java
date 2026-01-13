package OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Question {
    @Id
    @GeneratedValue
    private int questionid;
    private String question;
    
    @OneToMany(mappedBy = "questionid", cascade = CascadeType.ALL)
    private List<Answer> answer; 

	public Question(int questionid, String question, List<Answer> answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public int getQuestionid() { 
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
