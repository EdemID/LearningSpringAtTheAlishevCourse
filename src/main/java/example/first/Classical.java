package example.first;

import java.util.ArrayList;
import java.util.List;

public class Classical implements Music {

    private Genre genre = Genre.CLASSICAL;
    private List<String> classicalList = new ArrayList<>();

    {
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
