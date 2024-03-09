import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    public ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
    Scanner scn = new Scanner(System.in);
    static Tarea instance_Tarea = new Tarea();

    // Agregar parámetros a listaTareas
    public void ingresarDatos() {
        System.out.println("Ingrese la tarea a realizar");
        String nombre_tarea = scn.nextLine();

        System.out.println("Agregue una breve descripción de la tarea a realizar");
        String descripcion = scn.nextLine();

        System.out.println("¿Cúal es la duración de la actividad? (Minutos)");
        int duracion = scn.nextInt();
        scn.nextLine();

        System.out.println("¿Quién esta encargado de realizar la tarea?");
        String persona_encargada = scn.nextLine();

        String estado = agregarEstado();

        listaTareas.add(new Tarea(nombre_tarea, descripcion, duracion, persona_encargada, estado));
        System.out.println("La tarea ha sido registrada exitosamente");
        System.out.println(listaTareas);
    }

    // Repetir el ingreso de parámetros las veces necesarias
    public void asignarCantidadTareas() {
        int cont = 1;
        boolean continuarTareas = true;

        do {
            System.out.println("--------------- Tarea " + cont + " ---------------");
            ingresarDatos();

            if (cont >= 5) {
                boolean repetirMenu;

                do {
                    System.out.println("¿Quieres añadir más tareas al dia de hoy?");
                    System.out.println("1- Si");
                    System.out.println("2- No");

                    repetirMenu = false;
                    switch (scn.nextInt()) {
                        case 1:
                            continuarTareas = true;
                            break;

                        case 2:
                            continuarTareas = false;
                            break;

                        default:
                            System.out.println("Opción inválida");
                            repetirMenu = true;
                            break;
                    }
                    scn.nextLine();
                } while (repetirMenu);
            }
            cont++;
        } while (continuarTareas);
    }

    // Muestra todos los nombres de las tareas de la lista
    public void mostrarAtributosNombre() {
        for (Tarea i : listaTareas) {
            System.out.println(i.getNombre_tarea() + " - Posición: " + posicionTarea(i.getNombre_tarea()));
        }
    }

    // Muestra la posición(indice) en la que está una tarea del arreglo
    public int posicionTarea(String nombre) {
        int posicion = listaTareas.indexOf(nombre);
        return posicion;
    }

    // Eliminar una tarea de la lista
    public void eliminarTarea(String nombre) {
        listaTareas.remove(posicionTarea(nombre));
    }

    // Editar una tarea de la lista
    public void editarTarea(String nombre, int posicion) {
        boolean repetirMenu = false;

        do {
            System.out.println("¿Qué atributo deseas cambiar?");
            System.out.println("1- Nombre de la tarea");
            System.out.println("2- Descripción de la tarea");
            System.out.println("3- Duración de la tarea");
            System.out.println("4- Persona encargada de la tarea");
            System.out.println("5- Estado de la tarea");

            switch (scn.nextInt()) {
                case 1:
                    instance_Tarea.setNombre_tarea(nombre);
                    break;

                case 2:
                    System.out.println("Ingresa una descripción nueva");
                    instance_Tarea.setDescripcion(scn.nextLine());
                    break;

                case 3:
                    System.out.println("Ingresa una nueva duración paraa tarea");
                    instance_Tarea.setDescripcion(scn.nextLine());
                    break;

                case 4:
                    System.out.println("¿Quién será la nueva persona encargada?");
                    instance_Tarea.setPersona_encargada(scn.nextLine());
                    break;

                case 5:
                    String estado = "";
                    boolean band;

                    do {
                        System.out.println("Ingrese el estado de la actividad (Ingrese 1, 2 o 3 según corresponda)");
                        System.out.println("1 - Activo");
                        System.out.println("2 - En desarrollo");
                        System.out.println("3 - Realizada");

                        band = false;

                        switch (scn.nextInt()) {
                            case 1:
                                estado = "Activo";
                                band = true;
                                break;

                            case 2:
                                estado = "En desarrollo";
                                band = true;
                                break;

                            case 3:
                                estado = "Realizada";
                                band = true;
                                break;

                            default:
                                System.out.println("Opción inválida");
                                band = false;
                                break;
                        }
                        scn.nextLine();
                    } while (!band);

                default:
                    System.out.println("Opción inválida");
                    repetirMenu = true;
                    break;
            }
            scn.nextLine();
        } while (repetirMenu);
    }

    // Agregar atributo estado a la lista

    public String agregarEstado() {
        String estado = "";
        boolean band;

        do {
            System.out.println("Ingrese el estado de la actividad (Ingrese 1, 2 o 3 según corresponda)");
            System.out.println("1 - Activo");
            System.out.println("2 - En desarrollo");
            System.out.println("3 - Realizada");

            switch (scn.nextInt()) {
                case 1:
                    estado = "Activo";
                    band = true;
                    break;

                case 2:
                    estado = "En desarrollo";
                    band = true;
                    break;

                case 3:
                    estado = "Realizada";
                    band = true;
                    break;

                default:
                    System.out.println("Opción inválida");
                    band = false;
                    break;
            }
            scn.nextLine();
        } while (!band);

        return estado;
    }
}
