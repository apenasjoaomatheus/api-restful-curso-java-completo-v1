package com.estudos.apirestfulcurso.services;

import com.estudos.apirestfulcurso.entidades.Usuario;
import com.estudos.apirestfulcurso.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listar() {

        return repository.findAll();
    }

    public Usuario buscarPeloID(Long id) {

        Optional<Usuario> usuario = repository.findById(id);

        return usuario.get();
    }


    public Usuario salvarUsuario(Usuario u) {

        return repository.save(u);

    }
}