package com.academia.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.spring.model.Turma;
import com.academia.spring.service.TurmaService;

@RestController
@RequestMapping("api/academia/turmas")
public class TurmaController {

    @Autowired
    private TurmaService service;

    @GetMapping
    public ResponseEntity<List<Turma>> listarTurmas() {
        return ResponseEntity.ok().body(service.listarTurmas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(service.buscarTurmaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Turma> salvarTurma(@RequestBody Turma turma) {
        return ResponseEntity.ok().body(service.salvarTurma(turma));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turma> editarTurma(@PathVariable(name = "id") Long id, Turma turma) {
        return ResponseEntity.ok().body(service.editarTurma(id, turma));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirTurma(@PathVariable(name = "id") Long id) {
        service.excluirTurma(id);
        return ResponseEntity.ok().body("Turma excluída com sucesso!");
    }

}
