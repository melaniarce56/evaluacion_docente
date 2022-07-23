/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Ciclo;
import com.example.evaluacion_docente.repository.CicloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ISTA
 */
@Service
public class CicloServiceImpl implements CicloService{
    
    @Autowired
    CicloRepository cicloRepository;
    
    @Override
    public Ciclo create(Ciclo c) {
        return cicloRepository.save(c);
    }

    @Override
    public Ciclo findById(Integer id) {
        return cicloRepository.findById(id).orElse(new Ciclo());
    }

    @Override
    public List<Ciclo> findByAll() {
        return cicloRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        cicloRepository.deleteById(id);
    }
    
}
