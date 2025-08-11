package com.wipro.bhanu.quizmonorepo.exception;

public class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException(Long id) {
        super("Question not found with id: " + id);
    }
}
