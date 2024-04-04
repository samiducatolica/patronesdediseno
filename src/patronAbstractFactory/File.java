package patronAbstractFactory;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sala4
 */
public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("File: " + name);
    }
}

