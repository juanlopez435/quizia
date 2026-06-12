package com.quiz.quizia.controller;

import com.quiz.quizia.model.Resultado;
import com.quiz.quizia.repository.ResultadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultados")
@CrossOrigin("*")
public class ResultadoController {

    @Autowired
    private ResultadoRepository resultadoRepository;

    @PostMapping("/guardar")
    public Resultado guardarResultado(
            @RequestBody Resultado resultado){

        return resultadoRepository.save(resultado);
    }

    @GetMapping("/listar")
    public List<Resultado> listarResultados(){

        return resultadoRepository.findAll();
    }

    @GetMapping("/quiz/{quizId}")
    public List<Resultado> rankingPorQuiz(
            @PathVariable Integer quizId){

        return resultadoRepository
                .findByQuizIdOrderByPuntajeDesc(quizId);
    }
}