package com.academia.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modalidade")
public class Modalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false, length = 80)
    private String nomeModalidade;

    @Column(name = "criado_em")
    private String dataCriacao;

    public Modalidade() {
    }

    public Modalidade(String nome, String dataCriacao) {
        this.nomeModalidade = nome;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public String getNomeModalidade() {
        return nomeModalidade;
    }

    public void setNomeModalidade(String nomeModalidade) {
        this.nomeModalidade = nomeModalidade;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }
}
