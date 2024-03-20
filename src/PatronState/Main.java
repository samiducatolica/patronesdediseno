package PatronState;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Reproducir
        audioPlayer.play();
        // Pausar
        audioPlayer.pause();
        // Reproducir de nuevo (desde pausa)
        audioPlayer.play();
        // Detener
        audioPlayer.stop();
        // Intentar pausar cuando está detenido
        audioPlayer.pause();
    }
}