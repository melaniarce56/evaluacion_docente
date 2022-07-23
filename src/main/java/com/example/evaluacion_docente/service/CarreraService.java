/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Carrera;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface CarreraService {
    public Carrera create(Carrera c);
    public Carrera findById(Integer id);
    public List<Carrera> findByAll();
    public void delete(Integer id);
}
