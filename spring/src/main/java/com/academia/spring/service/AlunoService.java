package com.academia.spring.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.academia.spring.model.Aluno;
import com.academia.spring.repository.AlunoRepository;
import com.academia.spring.service.exceptions.ResourceNotFoundException;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> listarAlunos() {
        return repository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno buscarAlunoPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Aluno editarAluno(Long id, Aluno aluno) {
        try {
            Aluno a = repository.getReferenceById(id);
            BeanUtils.copyProperties(aluno, a);
            return repository.save(a);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        } catch (FatalBeanException f) {
            throw new ResourceNotFoundException(id);
        }
    }

    public void excuirAlunoPorId(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
    }

}
