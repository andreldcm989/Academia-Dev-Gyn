package com.academia.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.spring.model.Modalidade;
import com.academia.spring.service.ModalidadeService;

@RestController
@RequestMapping("/academia/modalidade")
public class ModalidadeController {

    @Autowired
    private ModalidadeService service;

    @GetMapping
    public ResponseEntity<List<Modalidade>> listarModalidades() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listarModalidades());
    }

    @PostMapping
    public ResponseEntity<Modalidade> salvarModalidade(@RequestBody Modalidade modalidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarModalidade(modalidade));
    }

}
