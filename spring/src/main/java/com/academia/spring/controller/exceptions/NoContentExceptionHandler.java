package com.academia.spring.controller.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.academia.spring.service.exceptions.NoContentException;

@ControllerAdvice
public class NoContentExceptionHandler {

    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<StandardError> noContent(NoContentException e, HttpServletRequest request) {
        String descricao = "No content";
        HttpStatus status = HttpStatus.NO_CONTENT;
        StandardError erro = new StandardError(Instant.now(), status.value(), descricao, e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(status).body(erro);
    }

}
