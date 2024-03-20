package PatronBridge;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Encendiendo TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando TV");
    }
}