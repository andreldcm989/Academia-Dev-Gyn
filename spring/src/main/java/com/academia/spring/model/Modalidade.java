package com.academia.spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "modalidade")
public class Modalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(value = "_id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 80)
    private String nomeModalidade;

    @Column(name = "criado_em", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", locale = "pt-BR")
    private LocalDateTime dataCriacao;

    @JsonIgnore
    @OneToMany(mappedBy = "modalidade", fetch = FetchType.LAZY)
    private List<Matricula> matriculas = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "modalidade", fetch = FetchType.LAZY)
    private List<Turma> turmas = new ArrayList<>();

    public Modalidade() {
    }

    public Modalidade(String nome) {
        this.nomeModalidade = nome;
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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

}
