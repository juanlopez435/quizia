package com.quiz.quizia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio(){

        return "index";
    }

    @GetMapping("/quiz")
    public String quiz(){

        return "quiz";
    }

    @GetMapping("/ranking")
    public String ranking(){

        return "ranking";
    }

    @GetMapping("/crearPregunta")
    public String crearPregunta(){

        return "crearPregunta";
    }

    @GetMapping("/crearQuiz")
    public String crearQuiz(){

        return "crearQuiz";
    }
    @GetMapping("/crearSala")
    public String crearSala(){

        return "crearSala";
    }
    @GetMapping("/unirseSala")
    public String unirseSala(){

        return "unirseSala";
    }
    @GetMapping("/sala")
    public String sala(){

        return "sala";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}