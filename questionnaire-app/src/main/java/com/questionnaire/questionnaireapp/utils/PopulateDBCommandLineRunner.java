package com.questionnaire.questionnaireapp.utils;

import java.time.LocalDate;
import java.time.LocalTime;

import com.questionnaire.questionnaireapp.repositories.AnswerRepository;
import com.questionnaire.questionnaireapp.repositories.QuestionRepository;
import com.questionnaire.questionnaireapp.entities.Answer;
import com.questionnaire.questionnaireapp.entities.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class PopulateDBCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	//We're doing this to have a table of users and accounts to play with in the app :)
	@Override
	public void run(String... args) throws Exception {
		Question question = new Question("How many employees do you have?");
		questionRepository.save(question);
		answerRepository.save(new Answer(question, "0-10"));
		answerRepository.save(new Answer(question, "10-100"));
		answerRepository.save(new Answer(question, "100>"));
		questionRepository.save(new Question("How many users do you have?"));
		questionRepository.save(new Question("How many departments do you have?"));
		questionRepository.save(new Question("How many costumers do you have?"));
		questionRepository.save(new Question("What is your revenew?"));


	}

}
