package com.darkcode.spring.app.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_LENG_PROG")
public class Lenguaje_programacionRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    @Column(name = "lenguaje")
    private String lenguaje;
    @Column(name = "tipo_paradigma")
    private String tipo_paradigma;
    @Column(name = "frameworks")
    private String frameworks;
}
