package patronDecorator;

public class Demo {
    /**
     * Decoradores de codificación y compresión
     *  Este ejemplo muestra cómo puedes ajustar el comportamiento de un objeto sin cambiar su código.
     *  Inicialmente, la clase de la lógica de negocio sólo podía leer y escribir datos en texto sin
     *  formato. Después creamos varias pequeñas clases envoltorio que añaden un nuevo comportamiento
     *  tras ejecutar operaciones estándar en un objeto envuelto.
     *  El primer wrapper codifica y decodifica información, y el segundo comprime y extrae datos.
     * Puedes incluso combinar estos wrappers envolviendo un decorador con otro
     */
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
