package com.proyecto1.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgDeEstudioController {
    @GetMapping("/ListarPrograma")
    public String listarProg() {
        return "listarProg";
    }
}

// private String nivEstudio;
// private String nombrePrograma;
// private int cantidadCreditos;
// private String estado;