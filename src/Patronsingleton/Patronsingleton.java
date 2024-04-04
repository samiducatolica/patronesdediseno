/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Patronsingleton;

/**
 *
 * @author sala4
 */
public class Patronsingleton {

    public static void main(String[] args) {
        // Obtenemos la instancia única del Singleton.
        Singleton singleton = Singleton.getInstance();

        // Llamamos a un método de la instancia única.
        singleton.showMessage();
    }
}
