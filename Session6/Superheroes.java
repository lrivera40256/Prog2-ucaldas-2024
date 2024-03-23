import java.util.ArrayList;

/**
 * Superheroes
 */
public class Superheroes {
    ArrayList<Superhero> dc_superheroes = new ArrayList<>();

    public void addSuperheroesDC() {
        dc_superheroes.add(new Superhero("Batman", 2, new String[] { "The richest", "Intelligent" }, false, 1));
        dc_superheroes
                .add(new Superhero("Superman", 3, new String[] { "Fly", "Laser eyes", "Super strength" }, true, 1));
    }

    public void showSuperheroesInformation() {

        // .size() devuelve la cantidad de elementos que tiene el array
        for (int i = 0; i < dc_superheroes.size(); i++) {
            // get(Index) accede a cada posicion eñ ArrayList
            System.out.println(dc_superheroes.get(i).superhero_name);
        }
    }
}