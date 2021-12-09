package example.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("example.first")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    Classical classical() {
        return new Classical();
    }

    @Bean
    Rock rock() {
        return new Rock();
    }

    @Bean
    Jazz jazz() {
        return new Jazz();
    }

    @Bean
    List<Music> musicList() {
        return new ArrayList<>(Arrays.asList(classical(), rock(), jazz()));
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    Computer computer() {
        return new Computer(musicPlayer());
    }
}
