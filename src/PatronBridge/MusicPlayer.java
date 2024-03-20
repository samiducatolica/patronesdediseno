package PatronBridge;

import PatronBridge.Music;
import PatronBridge.Device;

public class MusicPlayer extends EntertainmentDevice {
    private final Music music;

    public MusicPlayer(Device device, Music music) {
        super(device);
        this.music = music;
    }

    @Override
    public void play() {
        device.turnOn();
        System.out.print("Music player: ");
        music.play();
        device.turnOff();
    }
}