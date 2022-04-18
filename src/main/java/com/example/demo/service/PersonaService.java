/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Persona;
import java.util.Optional;

/**
 *
 * @author jajimenez
 */
@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Iterable<Persona> getPersona() {
        return personaRepository.findAll();
    }

    public Optional<Persona> getPersonaById(Integer id) {
        return personaRepository.findById(id);
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona actualizarPersona(Integer id, Persona persona) {
        persona.setId(id);
        return personaRepository.save(persona);
    }

    public void borrarPersona(Integer id) {
        Optional<Persona> persona = personaRepository.findById(id);
        personaRepository.delete(persona.get());

    }
}
