package com.academia.spring.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private double peso;

    private double altura;

    private Date dataAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(Aluno aluno, double peso, double altura, Date dataAvaliacao) {
        this.aluno = aluno;
        this.peso = peso;
        this.altura = altura;
        this.dataAvaliacao = dataAvaliacao;
    }

    public Long getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

}
