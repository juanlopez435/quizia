package com.quiz.quizia.controller;

import com.quiz.quizia.model.Pregunta;
import com.quiz.quizia.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
@CrossOrigin("*")
public class PreguntaController {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @GetMapping("/listar")
    public List<Pregunta> listarPreguntas() {

        return preguntaRepository.findAll();
    }

    @GetMapping("/quiz/{quizId}")
    public List<Pregunta> listarPorQuiz(
            @PathVariable Integer quizId){

        return preguntaRepository.findByQuizId(quizId);
    }

    @PostMapping("/guardar")
    public Pregunta guardarPregunta(
            @RequestBody Pregunta pregunta){

        return preguntaRepository.save(pregunta);
    }
}