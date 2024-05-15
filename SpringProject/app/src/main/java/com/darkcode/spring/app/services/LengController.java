package com.darkcode.spring.app.services;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.Lenguaje_programacion;

@Controller
public class LengController {
    @GetMapping("/lenguajes")
    public String listarLeng(Model model) {
        //
        Lenguaje_programacion leng1 = new Lenguaje_programacion();

        leng1.setLenguaje("JAVA");
        leng1.setTipo_paradigma("Orientado a objetos");
        leng1.setFrameworks("Apache Struts");

        //
        Lenguaje_programacion leng2 = new Lenguaje_programacion();

        leng2.setLenguaje("Phyton");
        leng2.setTipo_paradigma("Multiparadigma");
        leng2.setFrameworks("Flask");

        //
        Lenguaje_programacion leng3 = new Lenguaje_programacion();

        leng3.setLenguaje("JavaScript");
        leng3.setTipo_paradigma("basado en objetos");
        leng3.setFrameworks("React");

        ArrayList<Lenguaje_programacion> lenguajes = new ArrayList<>();
        lenguajes.add(leng1);
        lenguajes.add(leng2);
        lenguajes.add(leng3);

        model.addAttribute("listaAtributosLengProg", lenguajes);

        return "lenguajes";
    }
}
