package com.academia.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.spring.model.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
