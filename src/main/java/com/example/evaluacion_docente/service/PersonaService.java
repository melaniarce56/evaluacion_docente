/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Persona;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface PersonaService {
    public Persona create(Persona p);
    public Persona findById(Integer id);
    public List<Persona> findByAll();
    public void delete(Integer id);
}
