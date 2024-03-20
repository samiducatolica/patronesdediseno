package PatronBridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device speaker = new Speaker();

        Entertainment movie = new Movie("Vengadores");
        Entertainment music = new Music("Bohemian Rhapsody");

        EntertainmentDevice moviePlayer = new MoviePlayer(tv, (Movie) movie);
        EntertainmentDevice musicPlayer = new MusicPlayer(speaker, (Music) music);

        moviePlayer.play();
        musicPlayer.play();
    }
}