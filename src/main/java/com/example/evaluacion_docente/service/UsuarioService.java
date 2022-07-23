/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.evaluacion_docente.service;

import com.example.evaluacion_docente.model.Usuario;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface UsuarioService {
    public Usuario create(Usuario u);
    public Usuario findById(Integer id);
    public List<Usuario> findByAll();
    public void delete(Integer id);
}
