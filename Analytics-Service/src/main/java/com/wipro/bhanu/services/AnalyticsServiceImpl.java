package com.wipro.bhanu.services;
import org.springframework.stereotype.Service;

import com.wipro.bhanu.entity.QuizCount;
import com.wipro.bhanu.feign.AnalyticsInterface;
import com.wipro.bhanu.repository.AnalyticsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnalyticsServiceImpl implements AnalyticsService {
	private  final AnalyticsRepository analyticsRepository;
    
	private final AnalyticsInterface analyticsInterface;
	@Override
	public Integer getCountOfQuiz() {
		Integer count =  analyticsInterface.getCountOfQuiz();
		QuizCount quizCount = new QuizCount();
		quizCount.setQuizCount(count);
		analyticsRepository.save(quizCount);
		
		return count;
		
	}
	

}
