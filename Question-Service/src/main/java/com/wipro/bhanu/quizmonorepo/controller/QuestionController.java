package com.wipro.bhanu.quizmonorepo.controller;

import org.springframework.web.bind.annotation.*;

import com.wipro.bhanu.quizmonorepo.entity.Question;
import com.wipro.bhanu.quizmonorepo.entity.QuestionWrapper;
import com.wipro.bhanu.quizmonorepo.entity.Response;
import com.wipro.bhanu.quizmonorepo.enums.Category;
import com.wipro.bhanu.quizmonorepo.service.QuestionService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("api/v1/question")
@RequiredArgsConstructor
public class QuestionController {

	
	private final QuestionService questionService;
	
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }
	

    @GetMapping("/generateQuestionsForQuiz")
    public List<Integer> getQuestionsForQuiz(@RequestParam String category,@RequestParam String  difficultyLevel)
    {
    	return  questionService.getQuestionsForQuiz(category,difficultyLevel);
    }
    
    @PostMapping("/getQuestions")
    public List<QuestionWrapper> getQuestionforQuizById(@RequestBody List<Integer> questionIds){
    	return questionService.getQuestionsforQuizByIdService(questionIds);
    	
    }
    
    @PostMapping("/getScore")
    public Integer getScoreQuiz(@RequestBody List<Response> responses) {
    	return questionService.calculateUserScore(responses);
    	
    }
    
    
    
  
 /*  @PostMapping("/getQuestion")
 public List<QuestionWrapper> returnQuestionWrappersByListOfIds(@RequestBody List<Integer> questionIds)
    {
    	return  questionService.getMeQuestionWrappersBasedOnIDS(questionIds);
    }
   */ 
    
}