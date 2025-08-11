package com.wipro.bhanu.quizmonorepo.service;
import java.util.List;

import com.wipro.bhanu.quizmonorepo.entity.Question;
import com.wipro.bhanu.quizmonorepo.entity.QuestionWrapper;
import com.wipro.bhanu.quizmonorepo.entity.Response;
import com.wipro.bhanu.quizmonorepo.enums.Category;

public interface QuestionService {


	List<Integer> getQuestionsForQuiz(String category, String difficultyLevel);

	List<Question> getQuestionsByCategory(Category category);

	Question addQuestion(Question question);

	List<QuestionWrapper> getQuestionsforQuizByIdService(List<Integer> questionIds);

	Integer calculateUserScore(List<Response> responses);

	
}
