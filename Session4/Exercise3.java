import java.util.LinkedList;
import java.util.Scanner;

public class Exercise3 {
    Scanner scn = new Scanner(System.in);
    LinkedList lista = new LinkedList<>();
    String comparacion;
    boolean existe = false;

    public void crearListaObjetos() {
        moto moto1 = new moto("Luis", "akt", 2020, 200);
        moto moto2 = new moto("Jorge", "bmw", 2015, 600);
        moto moto3 = new moto("Miguel", "yamaha", 2021, 180);
        moto moto4 = new moto("Juan", "akt", 2020, 125);
        moto moto5 = new moto("Andres", "yamaha", 2024, 125);
        moto moto6 = new moto("Juana", "hero", 2019, 180);

        lista.add(moto1);
        lista.add(moto2);
        lista.add(moto3);
        lista.add(moto4);
        lista.add(moto5);
        lista.add(moto6);
    }

    public void buscarPorDueno(LinkedList<Exercise3> lista, String comparacion) {
        for (Exercise3 id : lista) {
            if (moto.class.getName().equals(comparacion)) {
                existe = true;
            }
        }
    }

    public void nombreDuenoBuscar() {
        System.out.println("La moto que busca está a nombre de: ");
        comparacion = scn.nextLine();
    }

    public void atenderCliente() {
        nombreDuenoBuscar();
        buscarPorDueno(lista, comparacion);
        System.out.println(existe);
    }
}

class moto {
    Scanner scn = new Scanner(System.in);
    public String dueno, marca;
    public int modelo, cilindraje;

    moto(String d, String m, int mod, int c) {
        dueno = d;
        marca = m;
        modelo = mod;
        cilindraje = c;
    }

}