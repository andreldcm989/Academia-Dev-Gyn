package com.academia.spring.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.academia.spring.model.Turma;
import com.academia.spring.repository.TurmaRepository;
import com.academia.spring.service.exceptions.ResourceNotFoundException;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    public List<Turma> listarTurmas() {
        return repository.findAll();
    }

    public Turma buscarTurmaPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Turma salvarTurma(Turma turma) {
        return repository.save(turma);
    }

    public Turma editarTurma(Long id, Turma turma) {
        try {
            Turma t = repository.getReferenceById(id);
            BeanUtils.copyProperties(turma, t);
            return repository.save(t);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        } catch (FatalBeanException f) {
            throw new ResourceNotFoundException(id);
        }
    }

    public void excluirTurma(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
    }

}
