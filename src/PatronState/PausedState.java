package PatronState;

public class PausedState implements State {
    private final AudioPlayer audioPlayer;

    public PausedState(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void pressPlay() {
        System.out.println("Reanudando la canción.");
        audioPlayer.setState(new PlayingState(audioPlayer));
    }

    @Override
    public void pressPause() {
        System.out.println("Ya está en pausa.");
    }

    @Override
    public void pressStop() {
        System.out.println("Deteniendo la canción.");
        audioPlayer.setState(new StoppedState(audioPlayer));
    }
}