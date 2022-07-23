/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Formulario;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface FormularioService {
    public Formulario create(Formulario f);
    public Formulario findById(Integer id);
    public List<Formulario> findByAll();
    public void delete(Integer id);
}
