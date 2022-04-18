/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Persona;

/**
 *
 * @author jajimenez
 */
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
