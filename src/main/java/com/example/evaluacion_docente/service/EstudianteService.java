/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Estudiante;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface EstudianteService {
    public Estudiante create(Estudiante e);
    public Estudiante findById(Integer id);
    public List<Estudiante> findByAll();
    public void delete(Integer id);
}
