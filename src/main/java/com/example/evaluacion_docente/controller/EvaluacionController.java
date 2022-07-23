/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Evaluacion;
import com.example.evaluacion_docente.service.EvaluacionServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ISTA
 */
@RestController
@RequestMapping("/api/evaluacion")
public class EvaluacionController {

    @Autowired
    EvaluacionServiceImpl evaluacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Evaluacion>> listar() {
        return new ResponseEntity<>(evaluacionService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Evaluacion> crear(@RequestBody Evaluacion c) {
        return new ResponseEntity<>(evaluacionService.create(c), HttpStatus.CREATED);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Evaluacion> actualizar(@PathVariable Integer id, @RequestBody Evaluacion evaluacion) {
        Evaluacion evaluacionActual = evaluacionService.findById(id);
        if (evaluacionActual != null) {

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Evaluacion> eliminar(@PathVariable Integer id) {
        evaluacionService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Evaluacion> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(evaluacionService.findById(id), HttpStatus.OK);
    }
}
