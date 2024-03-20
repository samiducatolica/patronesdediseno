package PatronBridge;

import PatronBridge.Entertainment;
import PatronBridge.Device;

public abstract class EntertainmentDevice implements Entertainment {
    protected Device device;

    public EntertainmentDevice(Device device) {
        this.device = device;
    }

    public abstract void play();
}