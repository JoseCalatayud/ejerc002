package es.santander.ascender.ejerc002;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc002.repository.ColumnaRepository;

@SpringBootTest
public class ColumnaRepositoryTests {

    @Autowired 
    ColumnaRepository cr;

    @Test
    void TestColumna(){
        cr.count();
    }
}
