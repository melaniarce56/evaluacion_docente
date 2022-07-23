/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Materia;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface MateriaService {
    public Materia create(Materia m);
    public Materia findById(Integer id);
    public List<Materia> findByAll();
    public void delete(Integer id);
}
