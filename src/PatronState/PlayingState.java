package PatronState;

public class PlayingState implements State {
    private final AudioPlayer audioPlayer;

    public PlayingState(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void pressPlay() {
        System.out.println("Ya se está reproduciendo una canción.");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausando la canción.");
        audioPlayer.setState(new PausedState(audioPlayer));
    }

    @Override
    public void pressStop() {
        System.out.println("Deteniendo la canción.");
        audioPlayer.setState(new StoppedState(audioPlayer));
    }
}