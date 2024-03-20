package FactoryMethod;

public class Avion extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por avión...");
    }
}