package example.first;

public class Classical implements Music {

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
