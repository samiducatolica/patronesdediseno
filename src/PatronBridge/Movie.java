package PatronBridge;

public class Movie implements Entertainment {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo película: " + title);
    }
}