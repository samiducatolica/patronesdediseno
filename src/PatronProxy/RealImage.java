package PatronProxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Cargando imagen " + filename + " desde el disco.");
    }

    @Override
    public void display() {
        System.out.println("Mostrando imagen " + filename);
    }
}