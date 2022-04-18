/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import com.example.demo.dto.PersonaDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author jajimenez
 */
@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column()
    private String nombre;

    @Column()
    private String apellido;

    public Persona() {

    }

    public Persona(PersonaDTO personaDTO) {
        this.nombre = personaDTO.getNombre();
        this.apellido = personaDTO.getApellido();

    }
}
