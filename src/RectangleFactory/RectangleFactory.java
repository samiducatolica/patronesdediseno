/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package RectangleFactory;

/**
 *
 * @author sala4
 */
public class RectangleFactory {

        public static void main(String[] args) {
        // Creamos una fábrica de círculos
        AbstractFactory circleFactory = new CircleFactory();

        // Creamos un círculo utilizando la fábrica de círculos
        Shape circle = circleFactory.createShape();
        circle.draw();

        // Creamos una fábrica de rectángulos
        AbstractFactory rectanglFactory = new RectanglFactory();

        // Creamos un rectángulo utilizando la fábrica de rectángulos
        Shape rectangle = rectanglFactory.createShape();
        rectangle.draw();
    }
}
