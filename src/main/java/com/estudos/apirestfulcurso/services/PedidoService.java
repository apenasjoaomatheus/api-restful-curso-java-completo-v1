package com.estudos.apirestfulcurso.services;

import com.estudos.apirestfulcurso.entidades.Pedido;
import com.estudos.apirestfulcurso.entidades.Usuario;
import com.estudos.apirestfulcurso.repositories.PedidoRepository;
import com.estudos.apirestfulcurso.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listar() {

        return repository.findAll();
    }

    public Pedido buscarPedidoPeloID(Long id) {

        Optional<Pedido> pedido = repository.findById(id);

        return pedido.get();
    }


    public Pedido salvarPedido(Pedido p) {

        return repository.save(p);

    }
}