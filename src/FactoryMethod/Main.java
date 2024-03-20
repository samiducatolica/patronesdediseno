package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        TransporteFactory avionFactory = new AvionFactory();
        Transporte avion = avionFactory.crearTransporte();
        avion.entregar();  // Salida: Entregando por avión...

        TransporteFactory barcoFactory = new BarcoFactory();
        Transporte barco = barcoFactory.crearTransporte();
        barco.entregar();  // Salida: Entregando por barco...

        TransporteFactory camionFactory = new CamionFactory();
        Transporte camion = camionFactory.crearTransporte();
        camion.entregar();  // Salida: Entregando por camión...
    }
}
