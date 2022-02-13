package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@EqualsAndHashCode @Getter @Setter @ToString
@Table(name = "usuarios")
public class Usuario {

    @Id
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;


}
