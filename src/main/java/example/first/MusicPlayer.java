package example.first;

import java.util.ArrayList;
import java.util.List;

/**
 * В этом классе применена архитектура IoC
 */
public class MusicPlayer {

    private List<Music> listMusic = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public void playMusic() {
        listMusic.forEach(x -> System.out.println("Playing: " + x.getSong()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public List<Music> getListMusic() {
        return listMusic;
    }
}
