<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {

=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x;

        System.out.println("Presione una de las opciones:");
        System.out.println("1- Ejercicio 1 (sumar datos de un array)");
        System.out.println("2- Ejercicio 2 (Crear y modificar un arrayList)");
        System.out.println("3- Ejercicio 3 (Buscar un elemento de una lista de objetos [LinkedList] )");
        x = scn.nextInt();

        switch (x) {
            case 1:
                // Exercise 1
                Exercise1 sum = new Exercise1();

                sum.leerArreglo();
                sum.sumarArreglo();
                sum.mostrarResultado();

                break;

            case 2:
                // Exercise 2
                Exercise2 llenarArrayList = new Exercise2();
                llenarArrayList.repetirHastaCondicion();

            case 3:
                // Exercise 3
                Exercise3 buscarNombre = new Exercise3();
                buscarNombre.atenderCliente();

            case 4:
                // Exersice 4

            default:
                break;
        }
>>>>>>> main
    }
}