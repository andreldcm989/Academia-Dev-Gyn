package com.academia.spring.service.exceptions;

public class NoContentException extends RuntimeException {

    public NoContentException(Long id) {
        super("Não existem itens para o id " + id + ".");
    }

}
