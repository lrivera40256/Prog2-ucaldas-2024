package com.darkcode.spring.app.services;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.Vehiculo;

@Controller
public class VehiculoController {
    @GetMapping("/vehiculos")
    public String listarVehiculo(Model model) {
        //
        Vehiculo vehiculo1 = new Vehiculo();

        vehiculo1.setTipo_vehiculo("Carro");
        vehiculo1.setMarca("Mazda");
        vehiculo1.setModelo("CX30 2020");
        vehiculo1.setColor("BLANCO");

        //
        Vehiculo vehiculo2 = new Vehiculo();

        vehiculo2.setTipo_vehiculo("Moto");
        vehiculo2.setMarca("AKT TTR200");
        vehiculo2.setModelo("2022");
        vehiculo2.setColor("NEGRO");

        //
        Vehiculo vehiculo3 = new Vehiculo();

        vehiculo3.setTipo_vehiculo("Moto");
        vehiculo3.setMarca("AKT NKD");
        vehiculo3.setModelo("2016");
        vehiculo3.setColor("ROJO");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        model.addAttribute("listaAtributosVehiculo", vehiculos);

        return "vehiculos";
    }
}
