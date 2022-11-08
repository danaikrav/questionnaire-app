package com.questionnaire.questionnaireapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionnaire.questionnaireapp.repositories.AnswerRepository;
import com.questionnaire.questionnaireapp.repositories.QuestionRepository;
import com.questionnaire.questionnaireapp.entities.Answer;
import com.questionnaire.questionnaireapp.entities.Question;

import java.util.List;

@Service
public class QuestionnaireService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}
	
	public Question getQuestionById(long questionId) {
		return questionRepository.findByQuestionId(questionId);
	}
	
	public List<Answer> getAllAnswerByQuestion(Question question) {
		return answerRepository.findAnswersByQuestionId(question);
	}
}
