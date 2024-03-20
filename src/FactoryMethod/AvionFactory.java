package FactoryMethod;

public class AvionFactory implements TransporteFactory {
    @Override
    public Transporte crearTransporte() {
        return new Avion();
    }
}
