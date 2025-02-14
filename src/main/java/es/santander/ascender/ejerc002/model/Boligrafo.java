package es.santander.ascender.ejerc002.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boligrafo {
    @Id
    private Long id;


    private int color;

    @Column (nullable = false)
    private boolean escribe;
    
    private String nombre;


    public Boligrafo () {

    }


    public int getColor() {
        return color;
    }


    public void setColor(int color) {
        this.color = color;
    }


    public boolean isEscribe() {
        return escribe;
    }


    public void setEscribe(boolean escribe) {
        this.escribe = escribe;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    



    
}
