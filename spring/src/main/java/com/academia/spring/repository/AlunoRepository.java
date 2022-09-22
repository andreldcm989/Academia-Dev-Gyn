package com.academia.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.spring.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
