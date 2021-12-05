package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * В этом классе применена архитектура IoC
 */
@Component
public class MusicPlayer {

    private Map<Genre, Music> musicMap = new HashMap<>();

    @Autowired
    public MusicPlayer(@Qualifier("classicalBean") Music classical,
                       @Qualifier("rockBean") Music rock) {
        musicMap.put(classical.getGenre(), classical);
        musicMap.put(rock.getGenre(), rock);
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        List<String> musicList = musicMap.get(genre).getSongs();
        int num = random.nextInt(musicList.size());
        return musicList.get(num);
    }
}
