package sistema_biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static RegistroBiblioteca instan_RegistroBiblioteca = new RegistroBiblioteca();

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de información de la biblioteca Gatos Estudiosos");
        System.out.println("Ingrese su nombre");
        String nombre = scn.nextLine();
        System.out.println("Tenga un saludo cordial " + nombre);

        boolean preguntar = true;
        boolean terminar;
        do {
            String eleccion = instan_RegistroBiblioteca.menuPrincipal();
            terminar = false;
            switch (eleccion) {
                // Agregar libro
                case "1":
                    instan_RegistroBiblioteca.registrarLibro(instan_RegistroBiblioteca.crearLibro());
                    System.out.println("El libro se ha añadido satisfactoriamente");
                    break;

                // Agregar autor
                case "2":
                    instan_RegistroBiblioteca.registrarAutor(instan_RegistroBiblioteca.crearAutor());
                    break;

                // Registrar préstamo
                case "3":
                    instan_RegistroBiblioteca.registrarPrestamo(instan_RegistroBiblioteca.crearPrestamo());
                    break;

                // Registrar devolución
                case "4":
                    instan_RegistroBiblioteca.registrarDevolucion();

                    // Elección inválida
                default:
                    terminar = false;
                    preguntar = false;
                    System.out.println("Ingrese una opción válida");
                    break;
            }

            terminar = false;
            while (preguntar) {
                preguntar = false;
                System.out.println("¿Deseas realizar otra modificación/validación en el sistema?");
                System.out.println(" 1- Si \n 2- No");
                switch (scn.nextLine()) {
                    case "1":
                        terminar = false;
                        preguntar = false;
                        break;
                    case "2":
                        terminar = true;
                        preguntar = false;
                        break;

                    default:
                        System.out.println("Ingrese una opción válida");
                        preguntar = true;
                        break;
                }
            }
        } while (!terminar);
    }
}