package PatronState;

public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        state = new StoppedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.pressPlay();
    }

    public void pause() {
        state.pressPause();
    }

    public void stop() {
        state.pressStop();
    }
}