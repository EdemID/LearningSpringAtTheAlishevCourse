package example.first;

import org.springframework.stereotype.Component;

@Component("classicalBean")
public class Classical implements Music {

    private Classical() {

    }
    /**
     * Фабричный метод
     */
    public static Classical getClassical() {
        return new Classical();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destruction");
    }
}
