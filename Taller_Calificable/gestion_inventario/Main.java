package gestion_inventario;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static RegistroInventario instan_RegistroInventario = new RegistroInventario();

    public static void main(String[] args) {
        instan_RegistroInventario.leer_archivo_productos(instan_RegistroInventario.listaProductos);
        System.out.println(instan_RegistroInventario.menorStock());
    }
}

// System.out.println("Bienvenido al sistema de registros de la tienda
// Pipitos");
// System.out.println("Ingrese su nombre");
// String nombre = scn.nextLine();
// System.out.println("Tenga un saludo cordial " + nombre);

// boolean preguntar = true;
// boolean terminar;
// do {
// String eleccion = instan_RegistroInventario.menuPrincipal();
// terminar = false;
// switch (eleccion) {
// // Agregar producto
// case "1":
// instan_RegistroInventario.registrarProducto(instan_RegistroInventario.crearProducto());
// System.out.println("El libro se ha añadido satisfactoriamente");
// break;

// // Agregar categoria
// case "2":
// instan_RegistroInventario.registrarCategoria(instan_RegistroInventario.crearCategoria());
// ;
// break;

// // Registrar proveedor
// case "3":
// instan_RegistroInventario.registrarProveedor(instan_RegistroInventario.crearProveedor());
// System.out.println("Su préstamo se ha registrado con éxito");
// break;

// // Registrar venta
// case "4":
// instan_RegistroInventario.registrarVenta(instan_RegistroInventario.crearVenta());

// // Elección inválida
// default:
// terminar = false;
// preguntar = false;
// System.out.println("Ingrese una opción válida");
// break;
// }

// terminar = false;
// while (preguntar) {
// preguntar = false;
// System.out.println("¿Deseas realizar otra modificación/validación en el
// sistema?");
// System.out.println(" 1- Si \n 2- No");
// switch (scn.nextLine()) {
// case "1":
// terminar = false;
// preguntar = false;
// break;
// case "2":
// terminar = true;
// preguntar = false;
// break;

// default:
// System.out.println("Ingrese una opción válida");
// preguntar = true;
// break;
// }
// }
// } while (!terminar);
// }
// }
