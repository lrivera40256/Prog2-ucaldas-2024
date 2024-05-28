package com.proyecto1.app.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Tutorial {
    private String nombre;
    private String descipcion;
    private String url;
    private String estado;
    private Date fecha;
    private String autor;
}
