public class Superhero {

    public String superhero_name = "";
    public int superpowers_number = 0;
    public String[] superpowers = new String[superpowers_number];
    public boolean IsAlive = false;
    public int universe = 0;

    public Superhero(String superhero_name_param, int superpowers_number_param, String[] superpowers_param,
            boolean isAlive_param, int universe_param) {
        this.superhero_name = superhero_name_param;
        this.superpowers_number = superpowers_number_param;
        this.superpowers = superpowers_param;
        this.IsAlive = isAlive_param;
        this.universe = universe_param;
    }

    public String getSuperhero_name() {
        return superhero_name;
    }

    public void setSuperhero_name(String superhero_name) {
        this.superhero_name = superhero_name;
    }

    public int getSuperpowers_number() {
        return superpowers_number;
    }

    public void setSuperpowers_number(int superpowers_number) {
        this.superpowers_number = superpowers_number;
    }

    public String[] getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(String[] superpowers) {
        this.superpowers = superpowers;
    }

    public boolean isIsAlive() {
        return IsAlive;
    }

    public void setIsAlive(boolean isAlive) {
        IsAlive = isAlive;
    }

    public int getUniverse() {
        return universe;
    }

    public void setUniverse(int universe) {
        this.universe = universe;
    }

    public void show_superpowersNames() {
        for (String i : superpowers) {
            System.out.println(i);
        }
    }
}