package com.academia.spring.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.academia.spring.model.Modalidade;
import com.academia.spring.repository.ModalidadeRepository;
import com.academia.spring.service.exceptions.ResourceNotFoundException;

@Service
public class ModalidadeService {

    @Autowired
    private ModalidadeRepository repository;

    public List<Modalidade> listarModalidades() {
        return repository.findAll();
    }

    public boolean modalidadeExiste(String nome) {
        return repository.existsByNomeModalidade(nome);
    }

    public Modalidade buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Modalidade salvarModalidade(Modalidade modalidade) {
        modalidade.setDataCriacao(LocalDateTime.now());
        return repository.save(modalidade);
    }

    public void excluirModalidade(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    public Modalidade atualizarModalidade(Long id, Modalidade modalidade) {
        try {
            Modalidade model = repository.getReferenceById(id);
            model.setNomeModalidade(modalidade.getNomeModalidade());
            return repository.save(model);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            throw new ResourceNotFoundException(id);
        }
    }

}
