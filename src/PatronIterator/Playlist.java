package PatronIterator;

public class Playlist implements Container<Song> {
    private final Song[] songs;

    public Playlist(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public Iterator<Song> getIterator() {
        return new SongIterator(songs);
    }
}