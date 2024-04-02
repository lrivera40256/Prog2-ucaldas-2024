import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

// Se debe crear una clase RegistroEstudiantes con los siguientes métodos:
// a. agregarEstudiante(Estudiante estudiante): Agrega un estudiante al registro. Este método debe realizar las mismas
// validaciones que el ejercicio anterior.
// b. eliminarEstudiante(String codigo): Elimina el estudiante que coincida con el código especificado.
// c. listarEstudiantes(): Imprime en la consola la información de todos los estudiantes registrados.
// d. buscarEstudiantes(String filtro): Busca y retorna una lista de estudiantes que coincidan con el filtro especificado. El
// filtro puede ser una cadena que se compara con el nombre, el código o la carrera del estudiante. Cualquiera de los
// 3 filtros se deben permitir.

public class RegistroEstudiantes {
    ArrayList<Estudiante> estudiantesMaticulados = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    // Método que crea un nuevo estudiante (objeto)
    public Estudiante crearEstudiante() {
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = scn.nextLine();
        System.out.println("Ingresa la carrera del estudiante");
        String carrera = scn.nextLine();
        boolean yaExiste;
        String codigo = "";
        do {
            yaExiste = false;
            System.out.println("Ingresa el código del estudiante");
            codigo = scn.nextLine();
            for (Estudiante estudiante : estudiantesMaticulados) {
                if (estudiante.getCodigo().equals(codigo)) {
                    yaExiste = true;
                    System.out.println("Ya existe un estudiante con el código ingresado \n"
                            + "Ingrese un código único por cada estudiante");
                }
            }
        } while (yaExiste);
        boolean promInvalido;
        float promedio = 0;
        do {
            promInvalido = false;
            System.out.println("Ingresa el promedio del estudiante");
            promedio = scn.nextFloat();
            scn.nextLine();
            if (promedio < 0 || promedio > 5) {
                promInvalido = true;
                System.out.println("Ingrese un promedio entre 0 y 5");
            }
        } while (promInvalido);

        Estudiante instan_estudiante = new Estudiante(nombre, codigo, carrera, promedio);
        return instan_estudiante;
    }

    // Método que agrega un estudiante (objeto) al ArrayList
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantesMaticulados.add(estudiante);
    }

    // Método que elimina un estudiante (objeto) si tiene el mismo código ingresado
    public void eliminarEstudiante(String codigoEliminar) {
        estudiantesMaticulados.removeIf(i -> i.getCodigo().equals(codigoEliminar));
    }

    // Método que muestra todos los estudiantes con sus atributos
    public void listarEstudiantes() {
        for (Estudiante i : estudiantesMaticulados) {
            System.out.println(i);
        }
    }

    // Función que filtra por la palabra ingresada y retorna un ArrayList de los
    // estudiantes que cumplen el filtro
    public ArrayList<Estudiante> buscarEstudiantes(String eleccion) {

        ArrayList<Estudiante> filtroEstudiantes = new ArrayList<>();
        String filtro = "";
        boolean condicion;
        do {
            condicion = true;
            switch (eleccion) {
                // Nombre
                case "1":
                    System.out.println("Ingrese el nombre por el que desea filtrar los estudiantes");
                    filtro = scn.nextLine();
                    for (Estudiante estudiante : estudiantesMaticulados) {
                        if (estudiante.getNombre().equals(filtro)) {
                            filtroEstudiantes.add(estudiante);
                        }
                    }
                    System.out.println("Estudiantes filtrados");
                    break;

                // Código
                case "2":
                    System.out.println("Ingrese el código por el que desea filtrar los estudiantes");
                    filtro = scn.nextLine();
                    for (Estudiante estudiante : estudiantesMaticulados) {
                        if (estudiante.getCodigo().equals(filtro)) {
                            filtroEstudiantes.add(estudiante);
                        }
                    }
                    System.out.println("Estudiantes filtrados");
                    break;

                // Carrera
                case "3":
                    System.out.println("Ingrese la carrera por la que desea filtrar los estudiantes");
                    filtro = scn.nextLine();
                    for (Estudiante estudiante : estudiantesMaticulados) {
                        if (estudiante.getCarrera().equals(filtro)) {
                            filtroEstudiantes.add(estudiante);
                        }
                    }
                    System.out.println("Estudiantes filtrados");
                    break;

                // Retroceder
                case "4":
                    break;

                default:
                    System.out.println("Opción inválida");
                    condicion = false;
                    break;
            }
        } while (!condicion);

        return filtroEstudiantes;
    }

    // Función que pide y retorna el filtro
    public String menuFiltro() {
        System.out.println("Selecione la categoria por la que desea filtrar");
        System.out.println("1- Nombre");
        System.out.println("2- Código");
        System.out.println("3- Carrera");
        System.out.println("4- Retroceder");
        String eleccion = scn.nextLine();

        return eleccion;
    }

    // Muestra una bienvenida
    public String menuPrincipal() {
        System.out.println("¿Qúe deseas hacer? Ingrese la opción deseada");
        System.out.println("1- Registrar un estudiante en el sistema");
        System.out.println("2- Eliminar un estudiante del sistema");
        System.out.println("3- Mostrar todos los estudiantes registrados");
        System.out.println("4- Filtrar estudiantes por categoría");

        return scn.nextLine();
    }

    // Método para leer un archivo y agregar los objetos al ArrayList
    public void leer_archivo(ArrayList<Estudiante> lista) {
        try {
            BufferedReader lector = new BufferedReader(
                    new FileReader("Sistema_estudiantes\\estudiantes_registrados.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split("\t");

                if (bloques.length == 4) {
                    String nombre = bloques[0];
                    String codigo = bloques[1];
                    String carrera = bloques[2];
                    float promedio = Float.valueOf(bloques[3]);
                    System.out.println(promedio);
                    lista.add(new Estudiante(nombre, codigo, carrera, promedio));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}