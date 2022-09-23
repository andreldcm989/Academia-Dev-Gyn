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

import com.academia.spring.model.Instrutor;
import com.academia.spring.service.InstrutorService;

@RestController
@RequestMapping("api/academia/instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorService service;

    @GetMapping
    public ResponseEntity<List<Instrutor>> listarInstrutores() {
        return ResponseEntity.ok().body(service.listarInstrutores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instrutor> buscarInstrutorPorId(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(service.buscarInstrutorPorId(id));
    }

    @PostMapping
    public ResponseEntity<Instrutor> salvarInstrutor(@RequestBody Instrutor instrutor) {
        return ResponseEntity.ok().body(service.salvarInstrutor(instrutor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Instrutor> editarInstrutor(@PathVariable(name = "id") Long id,
            @RequestBody Instrutor instrutor) {
        return ResponseEntity.ok().body(service.editarInstrutor(id, instrutor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirInstrutor(@PathVariable(name = "id") Long id) {
        service.excluirInstrutor(id);
        return ResponseEntity.ok().body("Instrutor excluído com sucesso!");
    }

}
