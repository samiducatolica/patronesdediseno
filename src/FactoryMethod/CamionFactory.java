package FactoryMethod;

public class CamionFactory implements TransporteFactory {
    @Override
    public Transporte crearTransporte() {
        return new Camion();
    }
}