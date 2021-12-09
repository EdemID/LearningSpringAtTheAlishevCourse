package example.first;

import example.first.interfaces.Music;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * В этом классе применена архитектура IoC
 */
public class MusicPlayer {

    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        int randomGenre = random.nextInt(musicList.size());
        List<String> songList = musicList.get(randomGenre).getSongs();
        int randomSong = random.nextInt(songList.size());
        return songList.get(randomSong);
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
}
