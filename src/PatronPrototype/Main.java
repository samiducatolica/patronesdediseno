package PatronPrototype;

public class Main {
    public static void main(String[] args) {
        // Crear el prototipo
        Prototype documentPrototype = new Document("Prototype Document");

        // Clonar el prototipo para crear nuevos documentos
        Prototype document1 = documentPrototype.clone();
        document1.setName("Document 1");

        Prototype document2 = documentPrototype.clone();
        document2.setName("Document 2");

        // Imprimir información de los documentos
        document1.printInfo();
        document2.printInfo();
    }
}