package com.academia.spring.model;

import java.time.Instant;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Instrutor extends Pessoa {

    private String setor;
    private String cargo;
    private Double salario;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Instant admissao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Instant demissao;
    private Integer cargaHorariaSemanal;
    private String tipoContrato;

    public Instrutor() {
    }

    public Instrutor(String nome, String sexo, String cpf, Instant nascimento, String email, String escolaridade,
            Long telefone, Instant dataCadastro, String setor, String cargo, Double salario,
            Instant admissao, Integer cargaHorariaSemanal, String tipoContrato) {
        super(nome, sexo, cpf, nascimento, email, escolaridade, telefone, dataCadastro);
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.tipoContrato = tipoContrato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Instant getAdmissao() {
        return admissao;
    }

    public Instant getDemissao() {
        return demissao;
    }

    public void setDemissao(Instant demissao) {
        this.demissao = demissao;
    }

    public Integer getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

}
