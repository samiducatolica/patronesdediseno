package patronBuilder;

public class Demo {
    public static void main(String[] args) {
        /**
         * Fabricación de autos paso a paso
         * En este ejemplo, el patrón Builder permite la construcción paso a paso de distintos modelos de auto.
         *
         * El ejemplo muestra también cómo el patrón Builder crea productos de distinto tipo (manual del auto)
         * utilizando los mismos pasos de construcción.
         *
         * El Director controla el orden de construcción. Sabe qué pasos de construcción invocar para producir éste o
         * aquel modelo de auto. Trabaja con los constructores únicamente a través de su interfaz común. Esto permite
         * pasar distintos tipos de constructores al director.
         *
         * El resultado final se extrae del objeto constructor porque el director no puede saber el tipo de producto
         * resultante. Sólo el objeto del constructor sabe exactamente lo que construye.
         */
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
