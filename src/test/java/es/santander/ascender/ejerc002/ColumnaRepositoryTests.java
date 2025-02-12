package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc002.model.Columna;
import es.santander.ascender.ejerc002.repository.ColumnaRepository;

@SpringBootTest
public class ColumnaRepositoryTests {

    @Autowired
    ColumnaRepository cr;

    @Test
    void TestColumna() {
        cr.count();
    }

    @Test()
    public void TestCrear() {
        Columna columna = new Columna();
        columna.setA2(125L);
        cr.save(columna);
        List<Columna> columnas = cr.findAll();
        assertTrue(cr
                .findById(columna.getId())
                .isPresent());
        assertTrue(columnas.size() == 1);

    }

}
