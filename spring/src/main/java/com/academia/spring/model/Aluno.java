package com.academia.spring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa {

    private Date dataMatricula;
    private List<Turma> turmas = new ArrayList<>();

    public Aluno() {
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public Aluno(String nome, String sexo, String cpf, java.sql.Date nascimento, String email, String escolaridade,
            Long telefone, String categoria, java.sql.Date dataCadastro, Date dataMatricula) {
        super(nome, sexo, cpf, nascimento, email, escolaridade, telefone, categoria, dataCadastro);
        this.dataMatricula = dataMatricula;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void excluirTurma(Turma turma) {
        turmas.remove(turma);
    }

}
