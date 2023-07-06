package com.poc;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
class PocApplicationTests {

    @Mock
    private CursoRepository cursoRepository;

    @Test
    public void testFindAllCursos() {
        Curso curso1 = new Curso("Test", 150f);
        Curso curso2 = new Curso("Test2", 250f);
        List<Curso> cursos = Arrays.asList(curso1, curso2);

        when(cursoRepository.findAll()).thenReturn(cursos);
    }

}
