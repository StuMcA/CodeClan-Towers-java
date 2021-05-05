import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> collection;

    public DiningRoom(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }
}
