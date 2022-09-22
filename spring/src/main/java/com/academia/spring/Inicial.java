package com.academia.spring;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
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
        Modalidade m2 = new Modalidade("Musculação");
        Modalidade m3 = new Modalidade("Crossfit");
        Modalidade m4 = new Modalidade("Spinning");
        Modalidade m5 = new Modalidade("Yoga");

        modalidadeRepository.saveAll(Arrays.asList(m1, m2, m3, m4, m5));

        Aluno a1 = new Aluno("André", "M", "012345678", Date.valueOf(LocalDate.of(2000, 01, 10)), "andre@gmail.com",
                "Superior cursando", 1199998877L, Date.valueOf(LocalDate.now()));
        Aluno a2 = new Aluno("José", "M", "220099876", Date.valueOf(LocalDate.of(1990, 11, 25)), "jose@gmail.com",
                "Superior completo", 1193390088L, Date.valueOf(LocalDate.now()));
        Aluno a3 = new Aluno("Maria", "F", "3344556677", Date.valueOf(LocalDate.of(2002, 07, 03)), "maria@gmail.com",
                "Doutorado", 3188990077L, Date.valueOf(LocalDate.now()));

        alunoRepository.saveAll(Arrays.asList(a1, a2, a3));

        Avaliacao avA1 = new Avaliacao(a1, 95.2, 1.81, Date.valueOf(LocalDate.now()));
        Avaliacao avA2 = new Avaliacao(a2, 91.2, 1.75, Date.valueOf(LocalDate.now()));
        avaliacaoRepository.saveAll(Arrays.asList(avA1, avA2));

        a1.getAvaliacoes().add(avA1);
        a2.getAvaliacoes().add(avA2);

        alunoRepository.saveAll(Arrays.asList(a1, a2));

        Instrutor i1 = new Instrutor("Marcelo", "M", "9988770142534",
                Date.valueOf(LocalDate.of(2022, Month.DECEMBER, 10)),
                "marcelo@academia.com", "Bacharel em Educação Física", 3198765678L, Date.valueOf(LocalDate.now()),
                "Educação", "Instrutor", 2990.50, Date.valueOf(LocalDate.now().plusDays(10)), 44, "CLT");

        instrutorRepository.save(i1);

        Turma t1 = new Turma(Date.valueOf(LocalDate.now()), m2);
        turmaRepository.save(t1);

        Matricula matA1 = new Matricula(Date.valueOf(LocalDate.now()), a1, m2, t1);
        matriculaRepository.save(matA1);
    }

}
