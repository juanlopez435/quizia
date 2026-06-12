package com.quiz.quizia.repository;

import com.quiz.quizia.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreguntaRepository
        extends JpaRepository<Pregunta, Integer> {

    List<Pregunta> findByQuizId(Integer quizId);

}