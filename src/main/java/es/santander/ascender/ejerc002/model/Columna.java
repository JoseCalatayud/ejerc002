package es.santander.ascender.ejerc002.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Columna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Max (value = 100)
    @Column(name = "numero_largo_1")
    private long a1;

    @Min(value = 20)
    @Column(name = "numero_largo_2", nullable=false, unique = true)
    private Long a2;
    private Dato d;

    @Email
    private String email;
    private boolean acierto;
    private Boolean equivocado;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    private Character c;

    public Boolean getEquivocado() {
        return equivocado;
    }

    public void setEquivocado(Boolean equivocado) {
        this.equivocado = equivocado;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    public Columna() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getA1() {
        return a1;
    }

    public void setA1(long a1) {
        this.a1 = a1;
    }

    public Long getA2() {
        return a2;
    }

    public void setA2(Long a2) {
        this.a2 = a2;
    }

    public Dato getD() {
        return d;
    }

    public void setD(Dato d) {
        this.d = d;
    }

}
