package com.questionnaire.questionnaireapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.questionnaire.questionnaireapp.entities.Answer;
import com.questionnaire.questionnaireapp.entities.Question;
import com.questionnaire.questionnaireapp.services.QuestionnaireService;

import java.util.List;


@RestController
public class QuestionnaireController {

	@Autowired
	QuestionnaireService service;
	
	@GetMapping("questions/") //localhost:8081/flights/origins/
	public ResponseEntity<List<Question>> GetQuestions(){
		List<Question> questions= service.getAllQuestion();
		
		if(questions==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}
	
	@GetMapping("questions/{questionId}") //localhost:8081/questions/1
	public ResponseEntity<List<Answer>> GetAnswersByQuestionId(@PathVariable long questionId) {
		Question question = service.getQuestionById(questionId);
		List<Answer> answers=service.getAllAnswerByQuestion(question);
		
		if(answers==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(answers,HttpStatus.OK);
	}
}
