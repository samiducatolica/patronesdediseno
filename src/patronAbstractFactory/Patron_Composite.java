package patronAbstractFactory;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sala4
 */
public class Patron_Composite {
    public static void main(String[] args) {
        // Crear archivos
        File file1 = new File("Archivo1.txt");
        File file2 = new File("Archivo2.txt");
        File file3 = new File("Archivo3.txt");

        // Crear carpetas y agregar archivos
        Folder folder1 = new Folder("Carpeta1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Carpeta2");
        folder2.add(file3);

        // Crear una carpeta que contiene archivos y subcarpetas
        Folder root = new Folder("Raíz");
        root.add(folder1);
        root.add(folder2);

        // Mostrar la estructura del sistema de archivos
        root.showName();
    }
}

