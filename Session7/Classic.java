import java.util.ArrayList;

public class Classic {
    ArrayList<Shoes> classic_shoes = new ArrayList<>();
    ArrayList<Shoes> mas_5_colores = new ArrayList<>();

    public ArrayList<Shoes> addClassicShoes() {
        classic_shoes.add(new Shoes("1234", 100f, 41, "ruta1", false, 15));
        classic_shoes.add(new Shoes("1324", 200f, 42, "ruta2", true, 8));
        classic_shoes.add(new Shoes("0434", 150f, 43, "ruta3", false, 9));
        classic_shoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 10));

        return classic_shoes;
    }

    public String showInformationShoes() {
        String Information = "";
        for (int i = 0; i < classic_shoes.size(); i++) {
            Information += classic_shoes.get(i).getReference() + "- Talla: " +
                    classic_shoes.get(i).getsize() + " - Precio: " +
                    classic_shoes.get(i).getPrice() + "- Fotos: " +
                    classic_shoes.get(i).getphoto_route() + "- Envio a casa: " +
                    classic_shoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    classic_shoes.get(i).getcant_colours() + "\n__";

        }
        return Information;
    }

    public void num_colores() {
        for (Shoes shoes : classic_shoes) {
            if (shoes.cant_colours > 5) {
                mas_5_colores.add(shoes);
            }
        }
    }
}