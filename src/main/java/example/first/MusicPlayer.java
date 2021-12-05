package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * В этом классе применена архитектура IoC
 */
@Component
public class MusicPlayer {

    private Classical classical;

    @Autowired
    public MusicPlayer(Classical classical) {
        this.classical = classical;
    }

    public void playMusic() {
        System.out.println(classical.getSong());
    }
}
