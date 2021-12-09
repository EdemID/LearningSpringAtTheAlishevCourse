package example.first.musics;

import example.first.Genre;
import example.first.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class Jazz implements Music {

    private Genre genre = Genre.JAZZ;
    private List<String> jazzList = new ArrayList<>();

    {
        jazzList.add("Du hast");
        jazzList.add("Wind cries Mary");
        jazzList.add("Fuel");
    }

    @Override
    public List<String> getSongs() {
        return jazzList;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }
}
