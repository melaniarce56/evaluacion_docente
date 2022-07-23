/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.repository;

import com.example.evaluacion_docente.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ISTA
 */
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{
    
}
