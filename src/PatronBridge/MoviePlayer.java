package PatronBridge;


import PatronBridge.Movie;
import PatronBridge.Device;

public class MoviePlayer extends EntertainmentDevice {
    private final Movie movie;

    public MoviePlayer(Device device, Movie movie) {
        super(device);
        this.movie = movie;
    }

    @Override
    public void play() {
        device.turnOn();
        System.out.print("Movie player: ");
        movie.play();
        device.turnOff();
    }
}