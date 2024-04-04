/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronMediator;

/**
 *
 * @author sala4
 */
public class User {
    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(name + " envió: " + message);
        mediator.sendMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name + " recibió: " + message);
    }
}
