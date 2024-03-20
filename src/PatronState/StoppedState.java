package PatronState;

public class StoppedState implements State {
    private final AudioPlayer audioPlayer;

    public StoppedState(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void pressPlay() {
        System.out.println("Reproduciendo la canción desde el principio.");
        audioPlayer.setState(new PlayingState(audioPlayer));
    }

    @Override
    public void pressPause() {
        System.out.println("La canción está detenida, no se puede pausar.");
    }

    @Override
    public void pressStop() {
        System.out.println("La canción ya está detenida.");
    }
}