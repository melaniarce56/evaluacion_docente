/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Persona;
import com.example.evaluacion_docente.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mateo
 */
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping("/crear")
    public ResponseEntity<Persona> crear(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaService.create(persona), HttpStatus.CREATED);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> lista() {
        return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        personaService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Persona> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(personaService.findById(id), HttpStatus.OK);
    }

}
