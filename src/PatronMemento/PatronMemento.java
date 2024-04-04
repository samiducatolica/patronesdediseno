/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PatronMemento;

/**
 *
 * @author sala4
 */
public class PatronMemento {
    public static void main(String[] args) {
        // Crear el editor de texto (Originator)
        Originator editor = new Originator();

        // Establecer y mostrar el estado inicial
        editor.setState("Estado inicial");
        System.out.println("Estado actual: " + editor.getState());

        // Guardar el estado actual
        Memento memento = editor.saveToMemento();

        // Cambiar el estado
        editor.setState("Estado modificado");
        System.out.println("Estado actual: " + editor.getState());

        // Restaurar el estado guardado
        editor.restoreFromMemento(memento);
        System.out.println("Estado restaurado: " + editor.getState());
    }
}
