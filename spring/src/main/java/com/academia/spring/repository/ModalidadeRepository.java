package com.academia.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.spring.model.Modalidade;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {

    boolean existsByNomeModalidade(String nome);
}
