/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.controller;

import com.example.evaluacion_docente.model.Formulario;
import com.example.evaluacion_docente.service.FormularioService;
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
 * @author ISTA
 */
@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @Autowired
    FormularioService formularioService;

    @PostMapping("/crear")
    public ResponseEntity<Formulario> crear(@RequestBody Formulario formulario) {
        return new ResponseEntity<>(formularioService.create(formulario), HttpStatus.CREATED);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Formulario>> lista() {
        return new ResponseEntity<>(formularioService.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        formularioService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Formulario> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(formularioService.findById(id), HttpStatus.OK);
    }
}
