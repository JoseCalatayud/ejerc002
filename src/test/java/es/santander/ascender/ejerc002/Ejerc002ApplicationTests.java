package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ejerc002ApplicationTests {

	@Autowired // Que de la clase que lleva la etiqueta cree u objeto 
				// si hace falta
	EjemploLogica miLogica;

	@Test
	void contextLoads() {
		int resultado = miLogica.multiplicar(5, 5);
		assertTrue(resultado == 25);
	}
	

}
