public class Main {

    public static void main(String[] args) {
        Superhero hero = new Superhero();
        Superhero hero2 = new Superhero();

        System.out.println(hero.superhero_name);
        System.out.println(hero2.superhero_name);

        hero.show_superpowersNames();
        hero2.show_superpowersNames();

    }
}