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

import com.academia.spring.model.Aluno;
import com.academia.spring.service.AlunoService;

@RestController
@RequestMapping("api/academia/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<Aluno>> buscarAlunos() {
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.listarAlunos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(alunoService.buscarAlunoPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> editarAluno(@PathVariable(name = "id") Long id, @RequestBody Aluno aluno) {
        return ResponseEntity.ok().body(alunoService.editarAluno(id, aluno));
    }

    @PostMapping
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno) {
        return ResponseEntity.ok().body(alunoService.salvarAluno(aluno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirAluno(@PathVariable(name = "id") Long id) {
        alunoService.excuirAlunoPorId(id);
        return ResponseEntity.ok().body("Aluno excluído com sucesso!");
    }

}
