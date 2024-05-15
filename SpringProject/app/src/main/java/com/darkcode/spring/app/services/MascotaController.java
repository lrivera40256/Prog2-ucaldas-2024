package com.darkcode.spring.app.services;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.Mascota;

@Controller
public class MascotaController {
    @GetMapping("/mascotas")
    public String listarMascotas(Model model) {
        //
        Mascota masc1 = new Mascota();

        masc1.setTipo_mascota("Perro");
        masc1.setnombre("Chocolate");
        masc1.setSexo("Macho");
        masc1.setEdad("10 años");
        masc1.setNombre_clinica_veterinaria("Huellitas");

        //
        Mascota masc2 = new Mascota();

        masc2.setTipo_mascota("Gato");
        masc2.setnombre("Peter");
        masc2.setSexo("Macho");
        masc2.setEdad("7 años");
        masc2.setNombre_clinica_veterinaria("Granjita");

        //
        Mascota masc3 = new Mascota();

        masc3.setTipo_mascota("Gato");
        masc3.setnombre("Katy");
        masc3.setSexo("Hembra");
        masc3.setEdad("4 años");
        masc3.setNombre_clinica_veterinaria("Huellitas");

        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(masc1);
        mascotas.add(masc2);
        mascotas.add(masc3);

        model.addAttribute("listaAtributosMascotas", mascotas);

        return "mascotas";
    }
}
