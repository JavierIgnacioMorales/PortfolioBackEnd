package com.portfolio.demoPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    //private int edad;
    private String profesion;
    private String imagen;
    
    public Persona(){}
    
    public Persona(Long id, String nombre, String apellido, String profesion, String imagen){
        this.id = id;
        this.nombre=nombre;
        this.apellido = apellido;
        //this.edad = edad;
        this.profesion = profesion;
        this.imagen = imagen;
    }
    
    
}
