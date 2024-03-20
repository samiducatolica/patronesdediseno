package PatronBridge;

public class Speaker implements Device {
    @Override
    public void turnOn() {
        System.out.println("Encendiendo altavoz");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando altavoz");
    }
}