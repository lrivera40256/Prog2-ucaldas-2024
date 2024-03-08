import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

    Scanner scn = new Scanner(System.in);
    ArrayList<String> cadenas = new ArrayList<String>();
    boolean band = false;
    int eleccion;

    public void agregarEliminarDatos() {
        switch (eleccion) {
            case 1:
                System.out.println("Ingresa la cadena a agregar");
                cadenas.add(scn.nextLine());
                break;
            case 2:
                System.out.println("Ingresa la posicion a eliminar");
                cadenas.remove(scn.nextInt());
                scn.nextLine();
                break;
            default:
                mostrarArrayList();
                band = true;
                break;
        }
    }

    public void mostrarArrayList() {
        System.out.print("ArrayList(");
        for (int i = 0; i < cadenas.size() - 1; i++) {
            System.out.print(cadenas.get(i) + "; ");
        }
        System.out.println(cadenas.get(cadenas.size() - 1) + ")");
    }

    public void decision() {
        System.out.println("Inserta una de las opciones");
        System.out.println("1- Añadir datos al arrayList");
        System.out.println("2- Eliminar dato(posición) del arrayList");
        System.out.println("x- Cualquier otro número para salir");

        eleccion = scn.nextInt();
        scn.nextLine();
    }

    public void repetirHastaCondicion() {
        while (!band) {
            decision();
            agregarEliminarDatos();
        }
    }
}