/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RectangleFactory;

/**
 *
 * @author sala4
 */
public class CircleFactory implements AbstractFactory {
   
    public Shape createShape() {
        return (Shape) new Circle() {};
    }
}
