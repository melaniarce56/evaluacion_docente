/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Carrera;
import com.example.evaluacion_docente.service.CarreraService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ISTA
 */
@RestController
@RequestMapping("/api/carrera")
public class CarreraController {
    @Autowired
    CarreraService carreraService;

    @GetMapping("/lista")
    public ResponseEntity<List<Carrera>> listar() {
        return new ResponseEntity<>(carreraService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Carrera> crear(@RequestBody Carrera carrera) {
        return new ResponseEntity<>(carreraService.create(carrera), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        carreraService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carrera> actualizar(@PathVariable Integer id, @RequestBody Carrera carrera) {
        Carrera carreraActual = carreraService.findById(id);
        if (carreraActual != null) {
            carreraActual.setNombreCarrera(carrera.getNombreCarrera());
            carreraActual.setDescripcion(carrera.getDescripcion());
            carreraActual.setIdPeriodoAcademico(carrera.getIdPeriodoAcademico());
            return new ResponseEntity<>(carreraService.create(carrera), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Carrera> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(carreraService.findById(id), HttpStatus.OK);
    }
}
