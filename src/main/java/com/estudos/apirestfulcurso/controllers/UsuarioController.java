package com.estudos.apirestfulcurso.controllers;

import com.estudos.apirestfulcurso.entidades.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioController {

    @GetMapping("/todos")
    public ResponseEntity<Usuario> findAll() {

        Usuario u = new Usuario(1L, "teste", "teste@gmail.com","181938193", "131231312");

        return ResponseEntity.ok().body(u);
    }
}
