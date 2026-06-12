package com.quiz.quizia.model;

import jakarta.persistence.*;
import com.quiz.quizia.model.Quiz;
@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    private Boolean activa;

    private Boolean iniciada;

    @ManyToOne
    private Quiz quiz;

    public Sala() {
    }

    public Sala(String codigo,
                Boolean activa,
                Quiz quiz) {

        this.codigo = codigo;
        this.activa = activa;
        this.quiz = quiz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    public Boolean getIniciada() {
        return iniciada;
    }

    public void setIniciada(Boolean iniciada) {
        this.iniciada = iniciada;
    }
}