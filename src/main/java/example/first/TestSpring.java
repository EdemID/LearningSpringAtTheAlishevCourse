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
        /**
         * Dependency Injection - внедрение зависимости спрингом
         */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        //внутренняя реализация внедрения зависимости через конструктор
        MusicPlayer mpThroughConstructor = new MusicPlayer(context.getBean("musicBean", Classical.class));

        //внутренняя реализация внедрения зависимости через set()
        MusicPlayer mpThroughSetter = new MusicPlayer();
        mpThroughSetter.setMusic(context.getBean("musicBean", Classical.class));

        context.close();
    }
}
