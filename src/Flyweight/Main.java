package Flyweight;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        park.plantTree("Pino", "Verde", 1, 1);
        park.plantTree("Pino", "Verde", 2, 2);
        park.plantTree("Arce", "Rojo", 3, 3);
        park.plantTree("Arce", "Rojo", 4, 4);

        park.displayTrees();
    }
}