package com.academia.spring.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Objeto não encontrado. Id " + id);
    }
}
