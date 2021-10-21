package com.albi.springBootProject.model;

//import org.hibernate.annotations.Table;
//import org.springframework.data.annotation.Id;
//
//import javax.persistence.Column;

import javax.persistence.*;

@Entity
@Table(name = "padrone")
public class Padrone {

    @Id
    @Column(name = "padrone_id")
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "padrone_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "padrone_sequence"
    )
    private int id;
    private String nome;
    private String cognome;

    public Padrone(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Padrone(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Padrone() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cognome")
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    @Override
    public String toString() {
        return "Padrone{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
