package PatronIterator;

public class SongIterator implements Iterator<Song> {
    private final Song[] songs;
    private int position;

    public SongIterator(Song[] songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.length && songs[position] != null;
    }

    @Override
    public Song next() {
        return songs[position++];
    }
}