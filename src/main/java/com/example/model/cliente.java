package com.example.model;

import jakarta.persistence. Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rut")
    private long rut;
    @Column(name = "name")
    private String name;

    public Long getRut(){
        return rut;
    }

    public String getName(){
        return name;
    }

    public void setRut(Long rut){
        this.rut = rut;
    }

    public void setName(String name){
        this.name = name;
    }
    
}