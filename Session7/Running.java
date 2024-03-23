import java.util.ArrayList;

public class Running {
    ArrayList<Shoes> running_shoes = new ArrayList<>();
    ArrayList<Shoes> runningT38 = new ArrayList<>();
    ArrayList<Shoes> no_dispo = new ArrayList<>();

    public ArrayList<Shoes> addRunningShoes() {
        running_shoes.add(new Shoes("1234", 100f, 41, "ruta1", false, 15));
        running_shoes.add(new Shoes("1324", 200f, 42, "ruta2", true, 8));
        running_shoes.add(new Shoes("0434", 150f, 43, "ruta3", false, 9));
        running_shoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 10));

        return running_shoes;
    }

    public String showInformationShoes() {
        String Information = "";
        for (int i = 0; i < running_shoes.size(); i++) {
            Information += running_shoes.get(i).getReference() + "- Talla: " +
                    running_shoes.get(i).getsize() + " - Precio: " +
                    running_shoes.get(i).getPrice() + "- Fotos: " +
                    running_shoes.get(i).getphoto_route() + "- Envio a casa: " +
                    running_shoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    running_shoes.get(i).getcant_colours() + "\n__";

        }
        return Information;
    }

    public void talla38() {
        for (Shoes shoes : running_shoes) {
            if (shoes.getsize() == 38) {
                runningT38.add(shoes);
            }
        }
    }

    public void no_disponible() {
        for (Shoes shoes : running_shoes) {
            if (!shoes.send_method) {
                no_dispo.add(shoes);
            }
        }
    }
}