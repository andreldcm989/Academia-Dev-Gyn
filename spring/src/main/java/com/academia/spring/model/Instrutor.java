package com.academia.spring.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Instrutor extends Pessoa {

    private String setor;
    private String cargo;
    private Double salario;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", locale = "pt-BR", timezone = "GMT-3")
    private LocalDateTime admissao;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", locale = "pt-BR", timezone = "GMT-3")
    private LocalDateTime demissao;
    private Integer cargaHorariaSemanal;
    private String tipoContrato;

    public Instrutor() {
    }

    public Instrutor(String nome, String sexo, String cpf, LocalDate nascimento, String email, String escolaridade,
            Long telefone, LocalDateTime dataCadastro, String setor, String cargo, Double salario,
            LocalDateTime admissao, Integer cargaHorariaSemanal, String tipoContrato) {
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

    public LocalDateTime getAdmissao() {
        return admissao;
    }

    public LocalDateTime getDemissao() {
        return demissao;
    }

    public void setDemissao(LocalDateTime demissao) {
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
