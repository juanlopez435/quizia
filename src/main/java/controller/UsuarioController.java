package com.quiz.quizia.controller;

import com.quiz.quizia.model.Usuario;
import com.quiz.quizia.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/crear")
    public Usuario crearUsuario(
            @RequestParam String nombre) {

        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);

        return usuarioRepository.save(usuario);
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {

        return usuarioRepository.findAll();
    }
}