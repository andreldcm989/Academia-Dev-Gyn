package com.academia.spring.controller.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.academia.spring.service.exceptions.ResourceNotFoundException;

@ControllerAdvice // intercepta as exceções que acontecerem na aplicação, e delega o tratamento
                  // para este objeto
public class ResourceExceptionHandler {

    // essa anotação intercepta o tipo de exceção passada como argumento, para este
    // método tratá-la.
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String erro = "Objeto não encontrado";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(Instant.now(), status.value(), erro, e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(status).body(standardError);
    }
}
