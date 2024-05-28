package com.proyecto1.app.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PROG_DE_ESTUDIO")
public class ProgDeEstudioController {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Nivel de estudio")
    private String nivEstudio;
    @Column(name = "Nombre del programa")
    private String nombrePrograma;
    @Column(name = "Cantidad de créditos")
    private int cantidadCreditos;
    @Column(name = "Estado")
    private String estado;
}