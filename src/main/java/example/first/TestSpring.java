package example.first;

import example.first.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        /**
         * Обращается к SpringConfig, считывает его и помещает все бины, которые там описаны в Application Context
         * В аргументе указать название конфигурационного файла спринга
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.playMusic());
        System.out.println("musicPlayer name - " + musicPlayer.getName() + " and volume - " + musicPlayer.getVolume());
        context.close();
    }
}
