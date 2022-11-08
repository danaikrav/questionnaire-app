package com.questionnaire.questionnaireapp.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questionnaire.questionnaireapp.entities.Answer;
import com.questionnaire.questionnaireapp.entities.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

	public List<Answer> findAnswersByQuestionId(Question questionId);
}
