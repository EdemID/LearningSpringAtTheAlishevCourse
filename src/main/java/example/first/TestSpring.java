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

        Music classical = context.getBean("classicalBean", Classical.class);
        System.out.println(classical.getSong());

        Music rock = context.getBean("rockBean", Rock.class);
        System.out.println(rock.getSong());
        context.close();
    }
}
