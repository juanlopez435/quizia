package com.quiz.quizia.controller;

import com.quiz.quizia.model.Participante;
import com.quiz.quizia.model.Sala;
import com.quiz.quizia.repository.ParticipanteRepository;
import com.quiz.quizia.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participantes")
@CrossOrigin("*")
public class ParticipanteController {

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping("/listar")
    public List<Participante> listarParticipantes(){

        return participanteRepository.findAll();
    }

    @PostMapping("/guardar")
    public Participante guardarParticipante(
            @RequestBody Participante participante){

        return participanteRepository.save(participante);
    }

    @GetMapping("/sala/{id}")
    public List<Participante> listarPorSala(
            @PathVariable Integer id){

        Sala sala =
                salaRepository.findById(id).orElse(null);

        if(sala == null){

            return List.of();
        }

        return participanteRepository.findBySala(sala);
    }
}