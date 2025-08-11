package com.wipro.bhanu.quizmonorepo.exception;

public class QuestionAlreadyExistsException extends RuntimeException {
    public QuestionAlreadyExistsException(String title) {
        super("Question already exists with title: " + title);
    }
}
