public class Song implements IComponent {
    private String songName;
    private String artist;
    private float speed;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
        this.speed = 1;
    }

    @Override
    public void play() {
        System.out.println("Playing the song " + songName
                + " by " + artist
                + " at speed of " + speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;

    }

    @Override
    public String getName() {
        return songName;
    }
    public String getArtist() {
        return artist;
    }
}
