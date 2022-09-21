package com.academia.spring.model;

import java.sql.Date;

public class Funcionario extends Pessoa {

    private String setor;
    private String cargo;
    private Double salario;
    private Date admissao;
    private Date demissao;
    private Integer cargaHorariaSemanal;
    private String tipoContrato;

    public Funcionario() {
    }

    public Funcionario(String nome, String sexo, String cpf, Date nascimento, String email, String escolaridade,
            Long telefone, String categoria, Date dataCadastro, String setor, String cargo, Double salario,
            Date admissao, Integer cargaHorariaSemanal, String tipoContrato) {
        super(nome, sexo, cpf, nascimento, email, escolaridade, telefone, categoria, dataCadastro);
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

    public Date getAdmissao() {
        return admissao;
    }

    public Date getDemissao() {
        return demissao;
    }

    public void setDemissao(Date demissao) {
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