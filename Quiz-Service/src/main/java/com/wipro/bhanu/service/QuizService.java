package com.wipro.bhanu.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.wipro.bhanu.entities.QuestionWrapper;
import com.wipro.bhanu.entities.Quiz;
import com.wipro.bhanu.entities.Response;
import com.wipro.bhanu.feign.QuizInterface;
import com.wipro.bhanu.repository.QuizRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizService {

	private final QuizRepository quizRepository;
	private final QuizInterface quizInterface;

	public Quiz createQuiz(String category, String level, String title) {

		List<Integer> questionIdsForQuiz = quizInterface.getQuestionsForQuiz(category, level);

		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionsIds(questionIdsForQuiz);
		return quizRepository.save(quiz);
	}

	public List<QuestionWrapper> getQuizQuestions(Integer id) {
		
		Quiz quiz=quizRepository.findById(id).get();
		List<Integer> questionIds=quiz.getQuestionsIds();
		return quizInterface.getQuestionforQuizById(questionIds);
	}

	public Integer calculateResult(Integer id, List<Response> responses) {
		return quizInterface.getScoreQuiz(responses);
	}

	public Integer getQuizCount() {
		return (int) quizRepository.count();
	}

}
