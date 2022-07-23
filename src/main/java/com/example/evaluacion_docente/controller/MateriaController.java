/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Materia;
import com.example.evaluacion_docente.service.MateriaService;
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
@RequestMapping("/api/materia")
public class MateriaController {

    @Autowired
    MateriaService materiaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Materia>> listar() {
        List<Materia> lista = materiaService.findByAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Materia> crear(@RequestBody Materia u) {

        return new ResponseEntity<>(materiaService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Materia> eliminar(@PathVariable Integer id) {
        materiaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Materia> actualizar(@PathVariable Integer id, @RequestBody Materia c) {

        Materia listaActual = materiaService.findById(id);

        listaActual.setNombreMateria(c.getNombreMateria());
        materiaService.create(listaActual);
        return  null;
    }
}
