package com.wipro.bhanu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bhanu.entity.QuizCount;

public interface AnalyticsRepository extends JpaRepository<QuizCount, Integer> {

}
