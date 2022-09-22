package com.academia.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.spring.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

}
