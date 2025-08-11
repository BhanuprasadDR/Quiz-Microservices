package com.wipro.bhanu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="QUIZ-SERVICE",path="/api/v1/quiz")
public interface AnalyticsInterface {
	
	@GetMapping("/getQuizCount")
    public Integer getCountOfQuiz();
	

}
