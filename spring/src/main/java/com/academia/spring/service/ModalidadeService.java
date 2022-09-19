package com.academia.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.spring.model.Modalidade;
import com.academia.spring.repository.ModalidadeRepository;

@Service
public class ModalidadeService {

    @Autowired
    private ModalidadeRepository repository;

    public List<Modalidade> listarModalidades() {
        return repository.findAll();
    }

    public Modalidade salvarModalidade(Modalidade modalidade) {
        return repository.save(modalidade);
    }
}
