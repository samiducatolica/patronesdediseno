/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAdapter;

/**
 *
 * @author sala4
 */
public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // no implementado
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing AVI file: " + fileName);
    }
}
