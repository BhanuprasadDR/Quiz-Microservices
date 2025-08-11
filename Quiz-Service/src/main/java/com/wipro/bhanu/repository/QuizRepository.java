package com.wipro.bhanu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bhanu.entities.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
