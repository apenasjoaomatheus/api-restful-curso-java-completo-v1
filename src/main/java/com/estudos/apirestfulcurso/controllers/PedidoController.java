package com.estudos.apirestfulcurso.controllers;

import com.estudos.apirestfulcurso.entidades.Pedido;
import com.estudos.apirestfulcurso.entidades.Usuario;
import com.estudos.apirestfulcurso.services.PedidoService;
import com.estudos.apirestfulcurso.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/todos")
    public ResponseEntity<List<Pedido>> findAll() {

        List<Pedido> pedidos = service.listar();
        return ResponseEntity.ok().body(pedidos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarPeloId(@PathVariable Long id) {

        Pedido pedido = service.buscarPedidoPeloID(id);

        return ResponseEntity.ok().body(pedido);

    }

    @PostMapping("/salvar")
    public ResponseEntity<Pedido> salvarUsuario(@RequestBody Pedido pedido) {
        pedido = service.salvarPedido(pedido);

        return ResponseEntity.ok().body(pedido);

    }
}
