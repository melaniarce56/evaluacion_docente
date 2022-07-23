/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Evaluacion;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface EvaluacionService {
    public Evaluacion create(Evaluacion ev);
    public Evaluacion findById(Integer id);
    public List<Evaluacion> findByAll();
    public void delete(Integer id);
}
