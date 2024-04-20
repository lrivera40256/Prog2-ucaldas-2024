package bonus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    Scanner scn = new Scanner(System.in);

    private String nombre;
    private String ciudad;
    private String anoFundacion;
    private String estadio;
    ArrayList<Futbolista> lisFutbo = new ArrayList<>();

    public Equipo(String nombre, String ciudad, String anoFundacion, String estadio, ArrayList<Futbolista> lista) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anoFundacion = anoFundacion;
        this.estadio = estadio;
        this.lisFutbo = lista;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo() {
    }

    // Crear futbolista
    public Futbolista crearFutbolista() {
        System.out.println("Ingrese el nombre del futbolista");
        String nombre = scn.nextLine();
        System.out.println("Inngrese su posicion");
        String posicion = scn.nextLine();
        System.out.println("Ingrese el dorsal");
        String dorsal = scn.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nacionalidad = scn.nextLine();

        Futbolista fichaje = new Futbolista(nombre, posicion, dorsal, nacionalidad);
        return fichaje;
    }

    // Añadir futbolista
    public void anadirFutbolista() {
        lisFutbo.add(crearFutbolista());
        System.out.println("El futbolista ha sido añadido exitosamente");

    }

    // Eliminar futbolista por por dorsal
    public void eliminarFutbolista() {
        System.out.println("Ingrese el número del dorsal del futbolista que desea eliminar");
        String elim = scn.nextLine();
        for (int i = 0; i < lisFutbo.size(); i++) {
            if (lisFutbo.get(i).getDorsal().equals(elim)) {
                lisFutbo.remove(i);
            }
        }
        System.out.println("El futbolista ha sido eliminado exitosamente");
    }

    public void getFutbolista(String nombre) {
        for (int i = 0; i < lisFutbo.size(); i++) {
            if (lisFutbo.get(i).getNombre().equals(nombre)) {
                System.out.println(lisFutbo.get(i));
            }
        }
    }

    public void listarFutbolistas() {
        for (Futbolista futbolista : lisFutbo) {
            System.out.println(futbolista);
        }
    }

    public void leer_archivo_futbolistas(ArrayList<Futbolista> lista) {
        try {
            BufferedReader lector = new BufferedReader(
                    new FileReader("bonus\\listaFutbolistas.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split("\t");

                if (bloques.length == 5) {
                    String nombreEquipo = bloques[0];
                    String nombre = bloques[1];
                    String posicion = bloques[2];
                    String dorsal = bloques[3];
                    String nacionalidad = bloques[4];

                    Equipo equipo = new Equipo(nombreEquipo);
                    Futbolista futbolista = new Futbolista(nombre, posicion, dorsal, nacionalidad);
                    lista.add(futbolista);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
