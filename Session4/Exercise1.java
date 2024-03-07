import java.util.Scanner;

public class Exercise1 {
    Scanner scn = new Scanner(System.in);
    int suma = 0;
    int[] arregloDatos = new int[5];

    public void sumarArreglo() {
        for (int i = 0; i < 5; i++) {
            suma += arregloDatos[i];
        }
    }

    public void leerArreglo() {
        System.out.println("El tamaño del arreglo será de 5");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el dato de la posición " + i);
            arregloDatos[i] = scn.nextInt();
        }
    }

    public void mostrarResultado() {
        System.out.println("El resultado de la suma de todos los elementos del arreglos es: " + suma);
    }
}