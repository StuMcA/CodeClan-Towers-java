import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void SetUp(){
        bedroom = new Bedroom(101, 2, "Double", 100.00);
        booking = new Booking(bedroom, 3);
    }
    @Test
    public void canReturnBill(){
        assertEquals(300.00, booking.getBill(), 0.01);
    }
}
