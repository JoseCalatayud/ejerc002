package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc002.model.Columna;
import es.santander.ascender.ejerc002.repository.ColumnaRepository;

@DataJpaTest
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

    @Test
    public void TestDelete(){
        
        TestCrear();
        assertTrue(cr.findById(1l).get().getId()==1l);
        cr.deleteById(1l);
        assertTrue(cr.findById(1l).isEmpty());
    };

    @Test
    @Transactional
    public void TestModificar(){
        TestCrear();
        Columna columna = cr.getReferenceById(1l);        
        List<Columna> columnas = cr.findAll();
        assertTrue(columnas.size() == 1);
        assertTrue(columna.getEmail()==null);
        assertTrue(columna.getId()==1);        
        columna.setEmail("sss@EEE");
        cr.save(columna);
        columnas = cr.findAll();
        columna = cr.getReferenceById(1l);
        assertTrue(columnas.size() == 1); 
        assertTrue(columna.getEmail()=="sss@EEE");
        assertTrue(columna.getId()==1);


        

    }


}
