import java.util.ArrayList;

public class Bedroom {


    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> collection;
    private String type;
    private Double rate;

    public Bedroom(int roomNumber, int capacity, String type, Double rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.collection = new ArrayList<>();
        this.rate = rate;
    }

    public int guestCount() {
        return this.collection.size();
    }

    public void addGuest(Guest guest) {
        this.collection.add(guest);
    }

    public void removeGuest(Guest guest){
        this.collection.remove(guest);
    }
    public Double getRate(){
        return this.rate;
    }
}
