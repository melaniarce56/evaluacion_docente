/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Evaluacion;
import com.example.evaluacion_docente.repository.EvaluacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ISTA
 */
@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    EvaluacionRepository evaluacionRepository;

    @Override
    public Evaluacion create(Evaluacion ev) {
        return evaluacionRepository.save(ev);
    }

    @Override
    public Evaluacion findById(Integer id) {
        return evaluacionRepository.findById(id).orElse(new Evaluacion());
    }

    @Override
    public List<Evaluacion> findByAll() {
        return evaluacionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        evaluacionRepository.deleteById(id);
    }

}
