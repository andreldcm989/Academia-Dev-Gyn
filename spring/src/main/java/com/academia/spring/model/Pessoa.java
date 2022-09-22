package com.academia.spring.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Date nascimento;
    private String sexo;
    private String cpf;
    private String escolaridade;
    private String email;
    private Long telefone;
    private Date dataCadastro;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, String cpf, Date nascimento, String email, String escolaridade,
            Long telefone, Date dataCadastro) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.escolaridade = escolaridade;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
