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
         * Создание объекта путем получения бина - название бина и тот класс, бин которого хотим получить
         */
        Music music = context.getBean("musicBean", Music.class);
        /**
         * Ручное внедрение зависимости
         */
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
