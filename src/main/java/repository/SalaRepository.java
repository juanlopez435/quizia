package com.quiz.quizia.repository;

import com.quiz.quizia.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository
        extends JpaRepository<Sala, Integer> {

    Sala findByCodigo(String codigo);
}