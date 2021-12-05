package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * В этом классе применена архитектура IoC
 */
@Component
public class MusicPlayer {

    private Classical classical;

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println(classical.getSong());
    }

    @Autowired
    public void setClassical(Classical classical) {
        this.classical = classical;
    }
}
