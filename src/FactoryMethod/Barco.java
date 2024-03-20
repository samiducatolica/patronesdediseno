package FactoryMethod;

public class Barco extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por barco...");
    }
}