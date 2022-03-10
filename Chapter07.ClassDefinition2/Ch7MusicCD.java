public class Ch7MusicCD {
    private String artist;

    private String title;

    private String id;

    public Ch7MusicCD(String a, String t) {
        artist = a;

        title = t;

        id = artist.substring(0, 2) + "-" + title.substring(0, 9);
    }
}
