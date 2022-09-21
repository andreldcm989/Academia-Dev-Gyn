package com.academia.spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.academia.spring.model.Modalidade;
import com.academia.spring.repository.ModalidadeRepository;

@Configuration
public class Inicial implements CommandLineRunner {

    @Autowired
    private ModalidadeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Modalidade m1 = new Modalidade("Natação");
        Modalidade m2 = new Modalidade("Musculação");
        Modalidade m3 = new Modalidade("Crossfit");
        Modalidade m4 = new Modalidade("Spinning");
        Modalidade m5 = new Modalidade("Yoga");

        repository.saveAll(Arrays.asList(m1, m2, m3, m4, m5));

    }

}
