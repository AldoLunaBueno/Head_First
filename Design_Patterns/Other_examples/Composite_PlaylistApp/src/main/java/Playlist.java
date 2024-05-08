import java.util.ArrayList;

public class Playlist implements IComponent {
    private String playlistName;
    ArrayList<IComponent> playlist;
    @Override
    public void play() {
        for (IComponent component : playlist) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component : playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<>();
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        playlist.add(component);
    }
    public void remove(IComponent component) {
        playlist.remove(component);
    }
}
