package example.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * В этом классе применена архитектура IoC
 */
public class MusicPlayer {

    private List<Music> musicList;

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
}
