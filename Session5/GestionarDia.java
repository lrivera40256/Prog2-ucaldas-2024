import java.util.Scanner;

public class GestionarDia {
    static Gestion instance_trabajo_dia = new Gestion();

    public void Gestion() {
        Scanner scn = new Scanner(System.in);
        boolean terminarGestion = true;

        System.out.println("----- Bienvenido a tu cuenta de administración del turno -----");
        System.out.println("- Aquí podras iniciar el turno(asignar tareas), modificar y eliminarlas tareas");

        // Asignar al menos 5 tareas
        instance_trabajo_dia.asignarCantidadTareas();

        // Menú de para continuar gestión o no
        boolean repetirMenu;
        do {
            System.out.println("¿Deseas añadir, eliminar o editar alguna tarea?");
            System.out.println("1- Si");
            System.out.println("2- No");

            repetirMenu = false;

            switch (scn.nextInt()) {
                case 1:
                    terminarGestion = false;
                    break;

                case 2:
                    terminarGestion = true;
                    break;

                default:
                    System.out.println("Opción inválida");
                    repetirMenu = true;
                    break;
            }
            scn.nextLine();
        } while (repetirMenu);

        if (!terminarGestion) {
            do {
                do {
                    System.out.println("¿Qué deseas hacer?");
                    System.out.println("1- Consulta todos los nombres de las tareas y su posición en la lista");
                    System.out.println("2- Añadir tarea");
                    System.out.println("3- Eliminar tarea");
                    System.out.println("4- Editar tarea");

                    switch (scn.nextInt()) {
                        case 1:
                            instance_trabajo_dia.mostrarAtributosNombre();
                            break;

                        case 2:
                            instance_trabajo_dia.ingresarDatos();
                            break;

                        case 3:
                            System.out.println("Ingresa el nombre de la tarea a eliminar");
                            instance_trabajo_dia.eliminarTarea(scn.nextLine());
                            break;

                        case 4:
                            System.out.println("Ingresa el nombre de la tarea a editar");
                            String nombre = scn.nextLine();
                            instance_trabajo_dia.editarTarea(nombre, instance_trabajo_dia.posicionTarea(nombre));
                            break;

                        default:
                            System.out.println("Opción inválida");
                            repetirMenu = true;
                            break;

                    }

                } while (repetirMenu);
                scn.nextLine();

                do {
                    System.out.println("¿Deseas seguir gestionando tu lista de tareas?");
                    System.out.println("1- Si");
                    System.out.println("2- No");

                    repetirMenu = false;

                    switch (scn.nextInt()) {
                        case 1:
                            terminarGestion = false;
                            break;

                        case 2:
                            terminarGestion = true;
                            break;

                        default:
                            System.out.println("Opción inválida");
                            repetirMenu = true;
                            break;
                    }
                    scn.nextLine();
                } while (repetirMenu);

            } while (!terminarGestion);
        }
    }

}