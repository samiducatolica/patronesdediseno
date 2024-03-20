package PatronPrototype;

public interface Prototype {
    Prototype clone();
    void setName(String name);
    String getName();
    void printInfo();
}