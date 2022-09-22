package com.academia.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.spring.model.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {

    boolean existsByNomeModalidade(String nome);
}
