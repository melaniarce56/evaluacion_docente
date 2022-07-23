/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Rol;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface RolService {
    public Rol create(Rol r);
    public Rol findById(Integer id);
    public List<Rol> findByAll();
    public void delete(Integer id);
}
