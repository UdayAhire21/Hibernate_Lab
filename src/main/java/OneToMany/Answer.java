package OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Answer {

	
	@Id
	@GeneratedValue
	@Column (name="answer_id", length=5)
	private int answerid;
	private String answer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Question questionid;
	
	public Question getQuestionid() {
		return questionid;
	}
	public void setQuestionid(Question questionid) {
		this.questionid = questionid;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	

}
