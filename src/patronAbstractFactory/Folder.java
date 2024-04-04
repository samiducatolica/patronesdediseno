package patronAbstractFactory;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sala4
 */
import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void showName() {
        System.out.println("Folder: " + name);
        for (Component component : children) {
            component.showName();
        }
    }
}
