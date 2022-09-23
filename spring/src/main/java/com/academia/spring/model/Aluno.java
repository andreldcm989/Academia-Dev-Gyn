package com.academia.spring.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aluno extends Pessoa {

    @JsonIgnore
    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;

    @JsonIgnore
    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String sexo, String cpf, LocalDate nascimento, String email, String escolaridade,
            Long telefone, LocalDateTime dataCadastro) {
        super(nome, sexo, cpf, nascimento, email, escolaridade, telefone, dataCadastro);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

}
