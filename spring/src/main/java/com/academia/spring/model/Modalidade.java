package com.academia.spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
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
    @JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR")
    private Date dataCriacao;

    @OneToMany(mappedBy = "modalidade")
    private List<Matricula> matriculas = new ArrayList<>();

    @OneToMany(mappedBy = "modalidade", fetch = FetchType.LAZY)
    private List<Turma> turmas = new ArrayList<>();

    public Modalidade() {
    }

    public Modalidade(String nome) {
        this.nomeModalidade = nome;
        this.dataCriacao = Date.valueOf(LocalDate.now());
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

    public Date getDataCriacao() {
        return dataCriacao;
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
