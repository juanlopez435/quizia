package com.quiz.quizia.repository;

import com.quiz.quizia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Integer> {

}