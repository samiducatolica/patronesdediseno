/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PatronMediator;

/**
 *
 * @author sala4
 */
public class PatronMediator {

    public static void main(String[] args) {
        // Crear el mediador
        Mediator mediator = new ChatMediator();

        // Crear usuarios
        User user1 = new User("Usuario1", mediator);
        User user2 = new User("Usuario2", mediator);
        User user3 = new User("Usuario3", mediator);

        // Agregar usuarios al mediador
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Los usuarios se comunican a través del mediador
        user1.send("Hola a todos!");
        user2.send("Hola, Usuario1!");
        user3.send("Hola, Usuario1 y Usuario2!");
    }
}
