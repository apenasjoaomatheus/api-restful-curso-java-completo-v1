package com.estudos.apirestfulcurso.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant horario;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Usuario cliente;


}
