/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.repository;

import com.example.evaluacion_docente.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ISTA
 */
public interface MateriaRepository extends JpaRepository<Materia, Integer>{
    
}