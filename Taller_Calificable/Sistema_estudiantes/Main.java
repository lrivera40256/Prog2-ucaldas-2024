import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static RegistroEstudiantes instan_RegistroEstudiantes = new RegistroEstudiantes();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        instan_RegistroEstudiantes.leer_archivo(instan_RegistroEstudiantes.estudiantesMaticulados);

        System.out.println("-- Gestión de estudiantes de la universidad Arbolitos verdes --");
        System.out.println("Ingrese su nombre");
        String nombre = scn.nextLine();
        System.out.println("Tenga un saludo cordial " + nombre);

        boolean terminar;
        do {
            String eleccion = instan_RegistroEstudiantes.menuPrincipal();
            terminar = false;
            switch (eleccion) {
                // Agregar estudiante
                case "1":
                    instan_RegistroEstudiantes.agregarEstudiante(instan_RegistroEstudiantes.crearEstudiante());
                    System.out.println("El estudiante se ha añadido satisfactoriamente");
                    break;

                // Eliminar estudiante
                case "2":
                    System.out.println("Ingrese el código del estudiante que desea eliminar del sistema");
                    instan_RegistroEstudiantes.eliminarEstudiante(scn.nextLine());
                    System.out.println("El estudiante se ha eliminado satisfactoriamente");
                    break;

                // Mostrar lista de estudiantes
                case "3":
                    System.out.println("    Estudiantes registrados en la universidad Arbolitos verdes: ");
                    instan_RegistroEstudiantes.listarEstudiantes();
                    break;

                // Filtrar estudiantes
                case "4":
                    String filtro = instan_RegistroEstudiantes.menuFiltro();
                    ArrayList<Estudiante> estudiantesFiltrados = instan_RegistroEstudiantes.buscarEstudiantes(filtro);
                    for (Estudiante estudiante : estudiantesFiltrados) {
                        System.out.println(estudiante);
                    }
                    break;

                // Elección inválida
                default:
                    terminar = false;
                    System.out.println("Ingrese una opción válida");
                    break;
            }

            boolean validacion;
            do {
                validacion = false;
                System.out.println("¿Deseas realizar otra modificación/ validación en el sistema?");
                System.out.println(" 1- Si \n 2- No");
                switch (scn.nextLine()) {
                    case "1":
                        terminar = false;
                        validacion = true;
                        break;
                    case "2":
                        terminar = true;
                        validacion = true;
                        break;

                    default:
                        System.out.println("Ingrese una opción válida");
                        validacion = false;
                        break;
                }
            } while (!validacion);
        } while (!terminar);
    }
}