/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface PeriodoAcademicoService {
    public PeriodoAcademico create(PeriodoAcademico pa);
    public PeriodoAcademico findById(Integer id);
    public List<PeriodoAcademico> findByAll();
    public void delete(Integer id);
}
