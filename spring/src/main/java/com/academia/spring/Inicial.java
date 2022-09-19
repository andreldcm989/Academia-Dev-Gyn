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
        Modalidade m1 = new Modalidade("Natação", "17/09/2022");
        Modalidade m2 = new Modalidade("Musculação", "18/09/2022");
        Modalidade m3 = new Modalidade("Crossfit", "19/09/2022");
        Modalidade m4 = new Modalidade("Spinning", "19/09/2022");
        Modalidade m5 = new Modalidade("Yoga", "19/09/2022");

        repository.saveAll(Arrays.asList(m1, m2, m3, m4, m5));

    }

}
