package com.tramp.controlescolar.controllers;

import com.tramp.controlescolar.models.tablas.Usuarios;
import com.tramp.controlescolar.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
@CrossOrigin(origins = "*")
public class UsuariosController {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping
    public List<Usuarios> mostrarUsuarios() {
        List<Usuarios> listaUsuarios = usuariosRepository.findAll();
        return listaUsuarios;
    }
}
