package com.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Question {
	@Id
	@GeneratedValue
	@JoinColumn (name="answer_id")
	private int questionid;
	private String question;
	@OneToOne
	@JoinColumn(name="answer_id")
	private Answer answerid;

	public Answer getAnswerid() {
		return answerid;
	}

	public void setAnswerid(Answer answerid) {
		this.answerid = answerid;
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

	public Question(int questionid, String question) {
		super();
		this.questionid = questionid;
		this.question = question;
	}

	

}
