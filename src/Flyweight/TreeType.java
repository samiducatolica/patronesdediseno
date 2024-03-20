package Flyweight;

public class TreeType implements Tree {
    private final String species;
    private final String color;

    public TreeType(String species, String color) {
        this.species = species;
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Dibujo " + color + " " + species + " arbol en (" + x + ", " + y + ")");
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }
}