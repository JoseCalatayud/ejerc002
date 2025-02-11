package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatoRepositoryTests {
    
    @Autowired
    DatoRepository repositorio;

    @Test
    public void testList(){
        Iterable<Dato>valores=repositorio.findAll();
        assertNotNull(valores);
        long longitud = repositorio.count();
        assertTrue(longitud == 0);
        
        
    }
    @Test
    public void testListById(){
        Optional <Dato> valor = repositorio.findById((long) 54);
        assertTrue(valor.isEmpty());

    }
    @Test
    public void testLeerUno() {
        Dato datoAGuardar = new Dato(null, "Juan Antonio");
        repositorio.save(datoAGuardar);
        Optional <Dato> valor = repositorio.findById(datoAGuardar.getId());
        assertTrue(!valor.isEmpty());
        assertTrue(valor.get().getNombre()=="Juan Antonio");
    }
}
