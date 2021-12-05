package example.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        /**
         * Обращается к applicationContext.xml, считывает его и помещает все бины, которые там описаны в Application Context
         * В аргументе указать название конфигурационного файла спринга
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Classical classical = context.getBean("musicBean", Classical.class);
        System.out.println(classical.getSong());
/*
        *//**
         * Dependency Injection - внедрение зависимости спрингом
         *//*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.setVolume(10);
        System.out.println(musicPlayer.getVolume());
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer2.getVolume());
*/
        context.close();
    }
}
