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

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Classical: " + musicPlayer.playMusic(Genre.CLASSICAL));
        System.out.println("Rock: " + musicPlayer.playMusic(Genre.ROCK));

        context.close();
    }
}
