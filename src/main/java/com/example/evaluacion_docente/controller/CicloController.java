/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Ciclo;
import com.example.evaluacion_docente.service.CicloService;
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
@RequestMapping("/api/ciclo")
public class CicloController {

    @Autowired
    CicloService cicloService;

    @GetMapping("/lista")
    public ResponseEntity<List<Ciclo>> listar() {
        List<Ciclo> lista = cicloService.findByAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Ciclo> crear(@RequestBody Ciclo u) {
        return new ResponseEntity<>(cicloService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Ciclo> eliminar(@PathVariable Integer id) {
        cicloService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Ciclo> actuaizar(@PathVariable Integer id, @RequestBody Ciclo c) {

        Ciclo listaActual = cicloService.findById(id);

        cicloService.create(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
