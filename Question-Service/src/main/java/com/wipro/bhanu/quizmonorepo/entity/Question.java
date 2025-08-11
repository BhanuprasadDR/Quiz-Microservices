package com.wipro.bhanu.quizmonorepo.entity;
import com.wipro.bhanu.quizmonorepo.enums.Category;
import com.wipro.bhanu.quizmonorepo.enums.DifficultyLevel;
import jakarta.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long QuestionID;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctAnswer;
	private Category category;
	private DifficultyLevel difficultyLevel;
}