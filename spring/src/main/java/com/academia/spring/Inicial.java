package com.academia.spring;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.academia.spring.model.Aluno;
import com.academia.spring.model.Avaliacao;
import com.academia.spring.model.Instrutor;
import com.academia.spring.model.Matricula;
import com.academia.spring.model.Modalidade;
import com.academia.spring.model.Turma;
import com.academia.spring.repository.AlunoRepository;
import com.academia.spring.repository.AvaliacaoRepository;
import com.academia.spring.repository.InstrutorRepository;
import com.academia.spring.repository.MatriculaRepository;
import com.academia.spring.repository.ModalidadeRepository;
import com.academia.spring.repository.TurmaRepository;

@Configuration
public class Inicial implements CommandLineRunner {

        @Autowired
        private AlunoRepository alunoRepository;
        @Autowired
        private AvaliacaoRepository avaliacaoRepository;
        @Autowired
        private InstrutorRepository instrutorRepository;
        @Autowired
        private MatriculaRepository matriculaRepository;
        @Autowired
        private ModalidadeRepository modalidadeRepository;
        @Autowired
        private TurmaRepository turmaRepository;

        @Override
        public void run(String... args) throws Exception {
                Modalidade m1 = new Modalidade("Natação");
                m1.setDataCriacao(LocalDateTime.now());
                Modalidade m2 = new Modalidade("Musculação");
                m2.setDataCriacao(LocalDateTime.now());
                Modalidade m3 = new Modalidade("Crossfit");
                m3.setDataCriacao(LocalDateTime.now());
                Modalidade m4 = new Modalidade("Spinning");
                m4.setDataCriacao(LocalDateTime.now());
                Modalidade m5 = new Modalidade("Yoga");
                m5.setDataCriacao(LocalDateTime.now());

                modalidadeRepository.saveAll(Arrays.asList(m1, m2, m3, m4, m5));

                Aluno a1 = new Aluno("André", "M", "012345678", LocalDate.of(1999, 02, 22),
                                "andre@gmail.com",
                                "Superior cursando", 1199998877L, LocalDateTime.now());
                Aluno a2 = new Aluno("José", "M", "220099876", LocalDate.of(1980, 03, 14),
                                "jose@gmail.com",
                                "Superior completo", 1193390088L, LocalDateTime.now());
                Aluno a3 = new Aluno("Maria", "F", "3344556677", LocalDate.of(1990, 03, 13),
                                "maria@gmail.com",
                                "Doutorado", 3188990077L, LocalDateTime.now());

                alunoRepository.saveAll(Arrays.asList(a1, a2, a3));

                Avaliacao avA1 = new Avaliacao(a1, 95.2, 1.81, Instant.now());
                Avaliacao avA2 = new Avaliacao(a2, 91.2, 1.75, Instant.now());
                avaliacaoRepository.saveAll(Arrays.asList(avA1, avA2));

                a1.getAvaliacoes().add(avA1);
                a2.getAvaliacoes().add(avA2);

                alunoRepository.saveAll(Arrays.asList(a1, a2));

                Instrutor i1 = new Instrutor("Marcelo", "M", "9988770142534",
                                LocalDate.of(1980, 12, 12),
                                "marcelo@academia.com", "Bacharel em Educação Física", 3198765678L,
                                LocalDateTime.now(),
                                "Educação", "Instrutor", 2990.50, LocalDateTime.now().plusDays(5), 44,
                                "CLT");

                instrutorRepository.save(i1);

                Turma t1 = new Turma(Date.valueOf(LocalDate.now()), m2);
                turmaRepository.save(t1);

                Matricula matA1 = new Matricula(Date.valueOf(LocalDate.now()), a1, m2, t1);
                matriculaRepository.save(matA1);

        }

}
