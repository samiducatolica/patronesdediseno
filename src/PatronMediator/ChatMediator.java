/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronMediator;

/**
 *
 * @author sala4
 */
import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private final List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User u : users) {
            // El usuario que envía el mensaje no lo recibe
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
