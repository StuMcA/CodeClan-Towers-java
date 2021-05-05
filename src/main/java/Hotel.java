import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningrooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        if (this.checkEmptyBedrooms().contains (bedroom)) {
            bedroom.addGuest(guest);
        }
    }

    public void checkOutGuestFromBedroom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }
    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public ArrayList<Bedroom> checkEmptyBedrooms() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if(bedroom.guestCount() == 0) {
                emptyBedrooms.add(bedroom);
            }
        }
        return emptyBedrooms;
    }
}
