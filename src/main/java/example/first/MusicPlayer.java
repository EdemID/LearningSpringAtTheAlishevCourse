package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * В этом классе применена архитектура IoC
 */
@Component
public class MusicPlayer {

    private Music classical;
    private Music rock;

    public MusicPlayer(@Qualifier("classicalBean") Music classical,
                       @Qualifier("rockBean") Music rock) {
        this.classical = classical;
        this.rock = rock;
    }

    public String playMusic() {
        return classical.getSong() + ", and" + rock.getSong();
    }
}
