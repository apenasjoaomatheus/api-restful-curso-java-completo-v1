package com.estudos.apirestfulcurso.controllers;

import com.estudos.apirestfulcurso.entidades.Usuario;
import com.estudos.apirestfulcurso.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> findAll() {

        List<Usuario> usuarios = usuarioService.listar();
        return ResponseEntity.ok().body(usuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> buscarPeloId(@PathVariable Long id) {

        Usuario usuario = usuarioService.buscarPeloID(id);

        return ResponseEntity.ok().body(usuario);

    }
}
