package com.academia.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.spring.model.Avaliacao;
import com.academia.spring.service.AvaliacaoService;

@RestController
@RequestMapping("api/academia/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public ResponseEntity<List<Avaliacao>> avaliacoes() {
        return ResponseEntity.ok().body(avaliacaoService.listarAvaliacoes());
    }

    @PostMapping
    public ResponseEntity<Avaliacao> salvarAvaliacao(@RequestBody Avaliacao avaliacao) {
        return ResponseEntity.ok().body(avaliacaoService.salvarAvaliacao(avaliacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirAvaliacao(@PathVariable(name = "id") Long id) {
        avaliacaoService.excluirAvaliacao(id);
        return ResponseEntity.ok().body("Avaliação excluída com sucesso!");
    }

}
