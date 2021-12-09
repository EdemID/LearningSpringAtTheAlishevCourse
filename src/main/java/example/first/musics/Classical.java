package example.first.musics;

import example.first.Genre;
import example.first.interfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void init() {
        System.out.println("Initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destruction");
    }
}
