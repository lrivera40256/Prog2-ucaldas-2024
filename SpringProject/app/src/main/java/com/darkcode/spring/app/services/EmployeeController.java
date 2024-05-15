package com.darkcode.spring.app.services;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.Employee;

@Controller
public class EmployeeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("Mensaje", "Hola desde vista");
        return "Saludo";
    }

    @GetMapping("/employee")
    public String informacionEmpleado(Model model) {
        Employee employee = new Employee();
        employee.setFullname("Miguel Rivera");
        employee.setUser_email("luislmrh02@hotmail.com");
        model.addAttribute("employeeAtributtes", employee);
        return "show_employee";
    }

    @GetMapping("/employees")
    public String listarEmpleados(Model model){
        Employee empleado1 = new Employee();
        Employee empleado2 = new Employee();

        empleado1.setFullname("Juan Felipe");
        empleado1.setUser_email("andres@gmail.com");
        empleado2.setFullname("Andres Juan");
        empleado2.setUser_email("andres@gmail.com");

        ArrayList<Employee> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        model.addAttribute("employeeListAtributte", empleados);

        return "employees";

    }
}
