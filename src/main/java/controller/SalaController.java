package com.quiz.quizia.controller;

import com.quiz.quizia.model.Sala;
import com.quiz.quizia.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
@CrossOrigin("*")
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping("/listar")
    public List<Sala> listarSalas() {
        return salaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Sala guardarSala(@RequestBody Sala sala) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int pos = (int) (Math.random() * chars.length());
            codigo.append(chars.charAt(pos));
        }

        sala.setCodigo(codigo.toString());
        sala.setActiva(true);
        sala.setIniciada(false);

        return salaRepository.save(sala);
    }

    @GetMapping("/id/{id}")
    public Sala getById(@PathVariable Integer id) {
        return salaRepository.findById(id).orElse(null);
    }

    @GetMapping("/codigo/{codigo}")
    public Sala getByCodigo(@PathVariable String codigo) {
        return salaRepository.findByCodigo(codigo);
    }

    @PostMapping("/iniciar/{id}")
    public Sala iniciar(@PathVariable Integer id) {

        Sala sala = salaRepository.findById(id).orElse(null);

        if (sala != null) {
            sala.setIniciada(true);
            return salaRepository.save(sala);
        }

        return null;
    }
}