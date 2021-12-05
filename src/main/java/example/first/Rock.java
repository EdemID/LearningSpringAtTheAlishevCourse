package example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("rockBean")
public class Rock implements Music {

    private Genre genre = Genre.ROCK;
    private List<String> rockList = new ArrayList<>();

    public Rock() {
        rockList.add("Du hast");
        rockList.add("Wind cries Mary");
        rockList.add("Fuel");
    }

    @Override
    public List<String> getSongs() {
        return rockList;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }
}
