package example.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Component("classicalBean")
public class Classical implements Music {

    private Genre genre = Genre.CLASSICAL;
    private List<String> classicalList = new ArrayList<>();

    private Classical() {
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Melancholia");
        classicalList.add("Love Is Stronger Than Death");
    }

    @Override
    public List<String> getSongs() {
        return classicalList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destruction");
    }
}
