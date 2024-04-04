/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patronsingleton;

/**
 *
 * @author sala4
 */
public class Singleton {
    // Paso 1: Crear una instancia estática privada de la clase.
    private static Singleton instance;

    // Paso 2: Hacer privado el constructor para evitar la creación de instancias desde fuera de la clase.
    private Singleton() {
        // Constructor privado para evitar la instanciación externa.
    }

    // Paso 3: Proporcionar un método estático público para obtener la instancia única de la clase.
    public static Singleton getInstance() {
        // Si la instancia no ha sido creada, la creamos.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos adicionales de la clase Singleton.
    public void showMessage() {
        System.out.println("¡Hola! Soy un Singleton.");
    }
}
