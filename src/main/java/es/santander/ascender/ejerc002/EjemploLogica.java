package es.santander.ascender.ejerc002;

import org.springframework.stereotype.Service;

@Service //indica que es una clase de la logica de negocio
            //vamos a poder instanciar objeto de manera automatica con la 
            //etiqueta @Autowired
public class EjemploLogica {

        public int multiplicar (int a, int b){
            return a * b;
        }
}
