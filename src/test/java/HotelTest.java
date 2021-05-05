import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Guest guestTwo;
    private Guest guestThree;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Booking booking;

    @Before
    public void setUp() {
        bedroom = new Bedroom(101, 2, "Double", 100.00);
        conferenceRoom = new ConferenceRoom("Paris Suite", 20);
        hotel = new Hotel();
        guest = new Guest("David");
        guestTwo = new Guest("Mary");
        guestThree = new Guest("Peter");
        hotel.addBedroom(bedroom);
    }

    @Test
    public void canBookInGuestToBedroom() {
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canCheckOutGuestFromBedroom() {
        hotel.checkInGuestToBedroom(bedroom, guest);
        hotel.checkOutGuestFromBedroom(bedroom, guest);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canBookRoom() {
        booking = hotel.bookRoom(bedroom, 3);
        assertEquals(3, booking.getNights());
    }

    @Test
    public void canCheckEmptyBedrooms() {
        assertEquals(1,  hotel.checkEmptyBedrooms().size());
    }

    @Test
    public void cantBookIntoBedroom() {
        hotel.checkInGuestToBedroom(bedroom, guest);
        hotel.checkInGuestToBedroom(bedroom, guestTwo);
        assertEquals(1, bedroom.guestCount());
    }
}
