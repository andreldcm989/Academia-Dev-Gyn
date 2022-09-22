package com.academia.spring.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Matricula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", locale = "pt-BR")
    private Date dataMatricula;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "modalidade_id")
    private Modalidade modalidade;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Matricula() {
    }

    public Matricula(Date dataMatricula, Aluno aluno, Modalidade modalidade, Turma turma,
            Instrutor instrutor) {
        this.dataMatricula = dataMatricula;
        this.aluno = aluno;
        this.modalidade = modalidade;
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
