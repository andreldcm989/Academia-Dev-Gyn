package com.academia.spring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Aluno extends Pessoa {

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;

    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String sexo, String cpf, java.sql.Date nascimento, String email, String escolaridade,
            Long telefone, String categoria, java.sql.Date dataCadastro, Date dataMatricula) {
        super(nome, sexo, cpf, nascimento, email, escolaridade, telefone, categoria, dataCadastro);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

}
