package PatronIterator;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Hotel California", "Eagles");
        Song song3 = new Song("Stairway to Heaven", "Led Zeppelin");

        Song[] songs = {song1, song2, song3};

        Playlist playlist = new Playlist(songs);

        Iterator<Song> iterator = playlist.getIterator();

        System.out.println("Lista de canciones:");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Título: " + song.getTitle() + ", Artista: " + song.getArtist());
        }
    }
}