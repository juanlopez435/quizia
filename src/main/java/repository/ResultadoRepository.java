package com.quiz.quizia.repository;

import com.quiz.quizia.model.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultadoRepository
        extends JpaRepository<Resultado, Integer> {

    List<Resultado> findByQuizIdOrderByPuntajeDesc(
            Integer quizId
    );
}