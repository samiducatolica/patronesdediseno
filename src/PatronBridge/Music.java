package PatronBridge;

public class Music implements Entertainment {
    private final String title;

    public Music(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo música: " + title);
    }
}