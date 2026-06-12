package com.quiz.quizia.controller;

import com.quiz.quizia.model.Quiz;
import com.quiz.quizia.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizs")
@CrossOrigin("*")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @PostMapping("/guardar")
    public Quiz guardarQuiz(
            @RequestBody Quiz quiz){

        return quizRepository.save(quiz);
    }

    @GetMapping("/listar")
    public List<Quiz> listarQuizs(){

        return quizRepository.findAll();
    }
}