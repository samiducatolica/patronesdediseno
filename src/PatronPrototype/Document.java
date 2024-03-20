package PatronPrototype;

public class Document implements Prototype {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Document(this.name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printInfo() {
        System.out.println("Documento: " + name);
    }
}