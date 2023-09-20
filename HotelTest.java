package Hotels;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    @Test
    public void testGetHotelName() {
        Hotel hotel = new Hotel("Test Hotel", "Test Address", 3, 7.5, 5);
        assertEquals("Test Hotel", hotel.getHotelName());
    }

    @Test
    public void testGetHotelCategory() {
        Hotel hotel = new Hotel("Test Hotel", "Test Address", 3, 7.5, 5);
        assertEquals(3, hotel.getHotelCategory());
    }
    @Test
    public void testToString() {
        Hotel hotel = new Hotel("Test Hotel", "Test Address", 3, 7.5, 5);
        String expected = "Hotel: Test Hotel\nStelle: 3✩\nValutazione hotel: 7.5\nPiani: 5\nIndirizzo: Test Address\n\nInfo: null\nServizi: null";
        assertEquals(expected, hotel.toString());
    }
}

