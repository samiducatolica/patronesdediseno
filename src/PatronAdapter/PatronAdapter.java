/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PatronAdapter;

/**
 *
 * @author sala4
 */
public class PatronAdapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}
