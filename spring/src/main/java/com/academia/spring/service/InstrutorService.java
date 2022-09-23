package com.academia.spring.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.academia.spring.model.Instrutor;
import com.academia.spring.repository.InstrutorRepository;
import com.academia.spring.service.exceptions.ResourceNotFoundException;

@Service
public class InstrutorService {

    @Autowired
    private InstrutorRepository instrutorRepository;

    public List<Instrutor> listarInstrutores() {
        return instrutorRepository.findAll();
    }

    public Instrutor buscarInstrutorPorId(Long id) {
        return instrutorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Instrutor salvarInstrutor(Instrutor instrutor) {
        return instrutorRepository.save(instrutor);
    }

    public Instrutor editarInstrutor(Long id, Instrutor instrutor) {
        try {
            Instrutor i = instrutorRepository.getReferenceById(id);
            BeanUtils.copyProperties(instrutor, i);
            return instrutorRepository.save(i);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        } catch (FatalBeanException f) {
            throw new ResourceNotFoundException(id);
        }
    }

    public void excluirInstrutor(Long id) {
        try {
            instrutorRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
    }

}
