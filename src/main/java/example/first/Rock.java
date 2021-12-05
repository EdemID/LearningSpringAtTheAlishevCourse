package example.first;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class Rock implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
