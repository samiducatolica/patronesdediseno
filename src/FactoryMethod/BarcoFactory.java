package FactoryMethod;

public class BarcoFactory implements TransporteFactory {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
}