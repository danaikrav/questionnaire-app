package com.questionnaire.questionnaireapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Question {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column
	 private long questionId;
	 @Column
	 private String question;
	 @OneToMany(mappedBy = "answer")
	 @JsonIgnore
	 private List<Answer> Answers;
	 
	
	 
	public Question() {
	}
	public Question(String question) {
		this.question = question;
	}
	public Question(long id, String question) {
		this.questionId = id;
		this.question = question;
	}
	public long getId() {
		return questionId;
	}
	public void setId(long id) {
		this.questionId = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return Answers;
	}
	public void setAnswers(List<Answer> answers) {
		Answers = answers;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + questionId + ", question=" + question + ", Answers=" + Answers + "]";
	}
	 
}
