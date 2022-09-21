package com.academia.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.spring.model.Modalidade;
import com.academia.spring.service.ModalidadeService;

@RestController
@RequestMapping("api/academia/modalidades")
public class ModalidadeController {

    @Autowired
    private ModalidadeService service;

    @GetMapping
    public ResponseEntity<List<Modalidade>> listarModalidades() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listarModalidades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Object> salvarModalidade(@RequestBody Modalidade modalidade) {
        if (service.modalidadeExiste(modalidade.getNomeModalidade())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Já existe uma modalidade com este nome.");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarModalidade(modalidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarModalidade(@PathVariable(value = "id") Long id) {
        service.excluirModalidade(id);
        return ResponseEntity.ok().body("Modalidade excluída com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarModalidade(@PathVariable(value = "id") Long id,
            @RequestBody Modalidade modalidade) {
        modalidade = service.atualizarModalidade(id, modalidade);
        return ResponseEntity.ok().body(modalidade);
    }
}
