// Se debe crear una clase RegistroBiblioteca con los siguientes métodos:
// a. registrarLibro(Libro libro): Agrega un libro al registro. Este método debe realizar las mismas validaciones que el
// ejercicio anterior.
// b. registrarAutor(Autor autor): Agrega un autor al registro.
// c. registrarPrestamo(Prestamo prestamo): Registra un préstamo de un libro a un usuario. Este método debe realizar
// las siguientes validaciones:
// El libro debe tener ejemplares disponibles.
// El usuario no debe tener préstamos vencidos.
// d. registrarDevolucion(Prestamo prestamo): Registra la devolución de un libro.
// e. listarLibros(): Imprime en la consola la información de todos los libros registrados.
// f. listarAutores(): Imprime en la consola la información de todos los autores registrados.
// g. listarPrestamos(): Imprime en la consola la información de todos los préstamos activos.
// h. buscarLibros(String filtro): Busca y retorna una lista de libros que coincidan con el filtro especificado. El filtro
// puede ser una cadena que se compara con el título, el autor, el ISBN o la categoría del libro.

package sistema_biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RegistroBiblioteca {
    Scanner scn = new Scanner(System.in);
    ArrayList<Libro> listaLibros = new ArrayList<>();
    ArrayList<Autor> listaAutores = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    // Método que crea un nuevo libro (objeto)
    public Libro crearLibro() {
        Autor autor = new Autor();
        System.out.println("Ingresa el título del libro");
        String titulo = scn.nextLine();

        System.out.println("Ingresa el nombre del autor");
        String nombre = scn.nextLine();
        if (filtrarPalabra(nombre).size() > 0) {
            autor = filtrarPalabra(nombre).get(0).getAutor();
        } else {
            System.out.println("El autor no está registrado en el sistema");
            System.out.println("- Registra el autor:");
            autor = crearAutor();
            registrarAutor(autor);
        }

        boolean yaExiste;
        String isbn = "";
        do {
            yaExiste = false;
            System.out.println("Ingresa el código del libro (ISBN)");
            isbn = scn.nextLine();
            for (Libro libro : listaLibros) {
                if (libro.getIsbn().equals(isbn)) {
                    yaExiste = true;
                    System.out.println("Ya existe un libro con el código ingresado \n"
                            + "Ingrese un código único por cada libro");
                }
            }
        } while (yaExiste);

        System.out.println("Ingrese la categoria del libro");
        String categoria = scn.nextLine();

        boolean ejemInvalidos;
        int ejemplares = 0;
        do {
            ejemInvalidos = false;
            System.out.println("Ingresa los ejemplares disponibles del libro");
            ejemplares = scn.nextInt();
            scn.nextLine();
            if (ejemplares <= 0) {
                ejemInvalidos = true;
                System.out.println("Ingrese una cantidad mayor que cero");
            }
        } while (ejemInvalidos);

        Libro instan_libro = new Libro(titulo, autor, isbn, categoria, ejemplares);
        return instan_libro;
    }

    // Método que añade un libro al ArrayList
    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    // Método que crea un nuevo autor
    public Autor crearAutor() {
        System.out.println("Ingrese el nombre del autor que desea registrar");
        String nombre = scn.nextLine();
        System.out.println("Ingrese la nacionalidad del autor");
        String nacionalidad = scn.nextLine();
        Autor instan_autor = new Autor(nombre, nacionalidad);
        return instan_autor;
    }

    // Método que añade un autor al ArrayList
    public void registrarAutor(Autor autor) {
        if (filtrarPalabra(autor.getNombre()).size() == 0) {
            listaAutores.add(autor);
            System.out.println("El autor se ha registrado satisfactoriamente");
        } else {
            System.out.println("El autor que intentas registrar ya existe en nuestro sistema");
        }
    }

    // Método que crea un nuevo usuario
    public Usuario crearUsuario() {
        String cedula = "";
        String nombre = "";
        boolean yaExiste;
        do {
            System.out.println("Ingrese el nombre del usuario");
            nombre = scn.nextLine();
            yaExiste = false;
            System.out.println("Ingresa la cédula del usuario");
            cedula = scn.nextLine();
            for (Usuario persona : listaUsuarios) {
                if (persona.getCedula().equals(cedula)) {
                    yaExiste = true;
                    System.out.println("Ya existe un usuario registrado con ese número de cédula \n"
                            + "Verifique que la cedula ingresada sea correcta y vuelva a intentarlo");
                }
            }
        } while (yaExiste);

        Usuario instan_usuario = new Usuario(nombre, cedula);

        return instan_usuario;
    }

    // Método que añade un usuario al ArrayList
    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Función que retorna si tiene vencido un prestamo recibiendo la cédula
    public boolean vencido(String cedula, ArrayList<Prestamo> listaPrestamos) {
        Date fechaActual = new Date();
        boolean prestVencido = false;
        if (listaPrestamos.size() > 0) {
            for (Prestamo prestamo : listaPrestamos) {
                if (prestamo.getUsuario().getCedula().equals(cedula)
                        && (prestamo.getFechaPrestamo().after(fechaActual))) {
                    System.out.println("Tiene un prestamo vencido");
                    prestVencido = true;
                }
            }
        }

        return prestVencido;
    }

    // Función que crea un nuevo préstamo
    public Prestamo crearPrestamo() {
        boolean disponible = false;
        String nombreLibro;
        do {
            System.out.println("A continuación se mostrarán los nombres de los libros disponibles");
            for (Libro libro : listaLibros) {
                System.out.println(libro.getTitulo());
            }

            System.out.println("Ingrese el nombre del libro que desea tomar prestado");
            nombreLibro = scn.nextLine();

            for (Libro libro : listaLibros) {
                if ((libro.getTitulo().equals(nombreLibro)) && (libro.getEjemplares() > 0)) {
                    disponible = true;
                }
            }
            if (!disponible) {
                System.out.println(
                        "No tenemos ejemplares disponibles del libro seleccionado o no tenemos el libro en nuestro catálogo");
            }
        } while (!disponible);
        Libro libro = filtrarPalabra(nombreLibro).get(0);

        boolean puedePrestar = true;
        String cedula = "";
        do {
            System.out.println("Ingrese su número de cédula");
            cedula = scn.nextLine();
            if (vencido(cedula, listaPrestamos)) {
                puedePrestar = false;
                System.out.println("El usuario no puede prestar libros");
            } else {
                puedePrestar = true;
            }
        } while (!puedePrestar);

        if (puedePrestar && listaPrestamos.size() == 0) {
            Usuario usuario = crearUsuario();
            listaUsuarios.add(usuario);
        }
        Usuario usuario = filtrarUsuario(cedula).get(0);

        Date fechaPrestamo = new Date();
        System.out.println("La fecha del préstamo es: " + fechaPrestamo);

        System.out.println("Ingrese la fecha de devolución del préstamo");
        System.out.println("ingrese el año");
        int anio = scn.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scn.nextInt();
        System.out.println("Ingrese el dia");
        int dia = scn.nextInt();
        Date fechaDevolucion = new Date(anio, mes, dia);
        scn.nextLine();

        Prestamo instan_prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
        return instan_prestamo;
    }

    // Método que añade un prestamo al ArrayList
    public void registrarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    // Método que elimina de la lista de préstamos un préstamo ingresando la cédula
    public void registrarDevolucion() {
        System.out.println("Ingrese su cédula");
        String cedula = scn.nextLine();
        if (vencido(cedula, listaPrestamos)) {
            System.out.println("Tu prestamo estaba vencido");
        }
        listaPrestamos.removeIf(i -> (i.getUsuario().getCedula().equals(cedula)));
        System.out.println("Su devolución ha sido exitosa");
    }

    // Función que filtra los libros dependiendo de la palabra ngresada
    public ArrayList<Libro> filtrarPalabra(String palabra) {
        ArrayList<Libro> filtro = new ArrayList<>();

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(palabra) || libro.getAutor().getNombre().equals(palabra)
                    || libro.getIsbn().equals(palabra) || libro.getCategoria().equals(palabra)) {
                filtro.add(libro);
            }
        }
        return filtro;
    }

    // Función que filtra los usuarios dependiendo de la cedula ngresada
    public ArrayList<Usuario> filtrarUsuario(String cedula) {
        ArrayList<Usuario> filtro = new ArrayList<>();

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCedula().equals(cedula)) {
                filtro.add(usuario);
            }
        }
        return filtro;
    }

    // Método que muestra todos los libros con sus atributos
    public void mostrarLibros() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

    // Método que muestra todos los autores con sus atributos
    public void mostrarAutores() {
        for (Autor autor : listaAutores) {
            System.out.println(autor);
        }
    }

    // Método que muestra todos los prestamos con sus atributos
    public void mostrarPrestamos() {
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo);
        }
    }

    // Método que muestra el menú principal
    public String menuPrincipal() {
        System.out.println("¿Qúe deseas hacer? Ingrese la opción deseada");
        System.out.println("1- Registrar un libro en el sistema");
        System.out.println("2- Registrar un autor en el sistema");
        System.out.println("3- Registrar préstamo");
        System.out.println("4- Registrar devolución");

        return scn.nextLine();
    }
}