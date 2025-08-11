package com.wipro.bhanu.controller;

import org.springframework.web.bind.annotation.RestController;

import com.wipro.bhanu.services.AnalyticsService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class AnalyticsController {
    
    private final AnalyticsService analyticsService;
    
    @GetMapping("/getQuizCount")
    public Integer getQuizCount() {
        return analyticsService.getCountOfQuiz();
    }
}

