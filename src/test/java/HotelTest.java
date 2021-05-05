import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp() {
        bedroom = new Bedroom(101, 2, "Double");
        conferenceRoom = new ConferenceRoom("Paris Suite", 20);
        hotel = new Hotel();
    }

    @Test
    public void canBookInGuestToBedroom() {
        hotel.addBedroom(bedroom);
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canCheckOutGuestFromBedroom() {
        hotel.addBedroom(bedroom);
        hotel.checkInGuestToBedroom(bedroom, guest);
        hotel.checkOutGuestFromBedroom(bedroom, guest);
        assertEquals(0, bedroom.guestCount());
    }
}
