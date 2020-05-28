public class MainPokemon {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pika 1", "fire", 55);
        Pokemon p2 = new Pokemon("Pika 2", "water", 90);

        p1.getDamage(p2);
        p2.getDamage(p1);

        p1.attack(p2);
        p2.attack(p1);

        p1.dead();
        p2.dead();

        p1.desc();
        p2.desc();

        p1.result();
    }
}