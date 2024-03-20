package FactoryMethod;

public class Camion extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por camión...");
    }
}