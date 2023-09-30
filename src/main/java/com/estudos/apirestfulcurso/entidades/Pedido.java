package com.estudos.apirestfulcurso.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_pedido")
@AllArgsConstructor
@NoArgsConstructor
public class Pedido implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "horario")
    private Instant horario;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Usuario cliente;


}
