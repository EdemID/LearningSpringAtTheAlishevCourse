package example.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockBean")
public class Rock implements Music {

    private Genre genre = Genre.ROCK;
    private List<String> rockList = new ArrayList<>();

    {
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
