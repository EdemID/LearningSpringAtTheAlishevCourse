package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * В этом классе применена архитектура IoC
 */
@Component
public class MusicPlayer {

    private Classical classical;
    private Rock rock;

    @Autowired
    public MusicPlayer(Classical classical, Rock rock) {
        this.classical = classical;
        this.rock = rock;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println(classical.getSong());
        System.out.println(rock.getSong());
    }
}
