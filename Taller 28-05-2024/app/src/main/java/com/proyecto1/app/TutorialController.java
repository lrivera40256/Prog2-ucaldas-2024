package com.proyecto1.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorialController {
    @GetMapping("/")
    public String inicio() {
        return "home";
    }

    @GetMapping("/ListarTutoriales")
    public String listar() {
        return "listarTut";
    }

    @GetMapping("/CrearTutorial")
    public String crear() {
        return "crearTut";
    }
}
