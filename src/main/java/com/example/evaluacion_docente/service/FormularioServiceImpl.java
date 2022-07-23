/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Formulario;
import com.example.evaluacion_docente.repository.FormularioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ISTA
 */
@Service
public class FormularioServiceImpl implements FormularioService {

    @Autowired
    FormularioRepository formularioRepository;

    @Override
    public Formulario create(Formulario f) {
        return formularioRepository.save(f);
    }

    @Override
    public Formulario findById(Integer id) {
        return formularioRepository.findById(id).orElse(new Formulario());
    }

    @Override
    public List<Formulario> findByAll() {
        return formularioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        formularioRepository.deleteById(id);
    }
}
