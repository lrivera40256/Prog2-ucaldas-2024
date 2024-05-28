package com.proyecto1.app.repository;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_TUTORIALES")
public class TutorialRepository {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripción")
    private String description;
    @Column(name = "URL")
    private String url;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "Autor")
    private Date autor;
}
