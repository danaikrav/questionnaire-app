package com.questionnaire.questionnaireapp.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="question")
	private Question questionId;
	@Column
	private String answer;
	
	
	public Answer(Question questionId, String answer) {
		this.questionId = questionId;
		this.answer = answer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Question getQuestionId() {
		return questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", questionId=" + questionId + ", answer=" + answer + "]";
	}
	
}
