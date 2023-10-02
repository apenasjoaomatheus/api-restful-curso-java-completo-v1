package com.estudos.apirestfulcurso.repositories;

import com.estudos.apirestfulcurso.entidades.Pedido;
import com.estudos.apirestfulcurso.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
