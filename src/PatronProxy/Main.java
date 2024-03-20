package PatronProxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // La imagen 1 se cargará desde el disco
        image1.display();
        // La imagen 1 ya está en memoria, se mostrará directamente
        image1.display();
        // La imagen 2 se cargará desde el disco
        image2.display();
        // La imagen 2 ya está en memoria, se mostrará directamente
        image2.display();
    }
}