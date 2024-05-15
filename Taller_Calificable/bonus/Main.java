package bonus;

import java.util.Scanner;

public class Main {
    static Equipo instan_Equipo = new Equipo();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        instan_Equipo.leer_archivo_futbolistas(instan_Equipo.lisFutbo);

        instan_Equipo.anadirFutbolista();

        instan_Equipo.eliminarFutbolista();

        System.out.println("Ingrese el nombre del futbolista del que desea obtener información");
        instan_Equipo.getFutbolista(scn.nextLine());

        System.out.println("Listado de futbolistas registrados");
        instan_Equipo.listarFutbolistas();
    }
}
