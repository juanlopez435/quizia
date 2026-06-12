package com.quiz.quizia.repository;

import com.quiz.quizia.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository
        extends JpaRepository<Quiz, Integer> {

}