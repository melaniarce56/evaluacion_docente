/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Ciclo;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface CicloService {
    public Ciclo create(Ciclo c);
    public Ciclo findById(Integer id);
    public List<Ciclo> findByAll();
    public void delete(Integer id);
}
