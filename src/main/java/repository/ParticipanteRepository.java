package com.quiz.quizia.repository;

import com.quiz.quizia.model.Participante;
import com.quiz.quizia.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipanteRepository
        extends JpaRepository<Participante, Integer> {

    List<Participante> findBySala(Sala sala);
}